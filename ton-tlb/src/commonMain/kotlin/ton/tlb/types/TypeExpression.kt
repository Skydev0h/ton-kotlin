package ton.tlb.types

import ton.bitstring.BitString
import ton.tlb.Cell
import ton.tlb.TlbDecoder

interface TypeExpression<T> {
    fun decode(decoder: TlbDecoder): T
}

data class IntConstantType(
    val value: Int,
) : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int = value

    override fun toString(): String = value.toString()
}

fun TypeExpression<*>.constant(value: Int) = IntConstantType(value)

operator fun TypeExpression<Int>.times(other: TypeExpression<Int>) = object : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int =
        this@times.decode(decoder) * other.decode(decoder)

    override fun toString(): String = "(${this@times} * $other)"
}

operator fun TypeExpression<Int>.times(other: Int) = object : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int =
        this@times.decode(decoder) * other

    override fun toString(): String = "(${this@times} * $other)"
}

operator fun Int.times(other: TypeExpression<Int>) = object : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int =
        this@times * other.decode(decoder)

    override fun toString(): String = "(${this@times} * $other)"
}

data class UintType(
    val bitsCount: TypeExpression<Int>,
) : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int = decoder.reader.readUInt(bitsCount.decode(decoder)).toInt()

    override fun toString(): String = "(## $bitsCount)"
}

fun TypeExpression<*>.uint(bitsCount: Int) = UintType(constant(bitsCount))
fun TypeExpression<*>.uint(bitsCount: TypeExpression<Int>) = UintType(bitsCount)
fun TypeExpression<*>.uint8() = uint(8)
fun TypeExpression<*>.uint16() = uint(16)
fun TypeExpression<*>.uint32() = uint(32)

data class IntType(
    val bitsCount: TypeExpression<Int>,
) : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int = decoder.reader.readInt(bitsCount.decode(decoder))

    override fun toString() = "int$bitsCount"
}

fun TypeExpression<*>.int(bitsCount: Int) = IntType(constant(bitsCount))
fun TypeExpression<*>.int(bitsCount: TypeExpression<Int>) = IntType(bitsCount)
fun TypeExpression<*>.int8() = int(8)
fun TypeExpression<*>.int16() = int(16)
fun TypeExpression<*>.int32() = int(32)

data class ULongType(
    val bitsCount: TypeExpression<Int>,
) : TypeExpression<Long> {
    override fun decode(decoder: TlbDecoder): Long = decoder.reader.readULong(bitsCount.decode(decoder)).toLong()
}

fun TypeExpression<*>.ulong(bitsCount: Int) = ULongType(constant(bitsCount))
fun TypeExpression<*>.ulong(bitsCount: TypeExpression<Int>) = ULongType(bitsCount)
fun TypeExpression<*>.uint64() = ulong(64)

data class LessThanIntType(
    val value: TypeExpression<Int>,
) : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int {
        val int = value.decode(decoder) - 1
        val countLeadingZeroBits = int.countLeadingZeroBits()
        val bits = UInt.SIZE_BITS - countLeadingZeroBits
        return decoder.reader.readUInt(bits).toInt()
    }

    override fun toString(): String = "(#< $value)"
}

fun TypeExpression<*>.lessThanInt(value: Int) = LessThanIntType(constant(value))
fun TypeExpression<*>.lessThanInt(value: TypeExpression<Int>) = LessThanIntType(value)


data class LessThanOrEqualsIntType(
    val value: TypeExpression<Int>,
) : TypeExpression<Int> {
    override fun decode(decoder: TlbDecoder): Int {
        val int = value.decode(decoder)
        val countLeadingZeroBits = int.countLeadingZeroBits()
        val bits = UInt.SIZE_BITS - countLeadingZeroBits
        return decoder.reader.readUInt(bits).toInt()
    }

    override fun toString(): String = "(#<= $value)"
}

fun TypeExpression<*>.lessThanOrEqualsInt(value: Int) = LessThanOrEqualsIntType(constant(value))
fun TypeExpression<*>.lessThanOrEqualsInt(value: TypeExpression<Int>) = LessThanOrEqualsIntType(value)

data class BitStringType(
    val bitsCount: TypeExpression<Int>,
) : TypeExpression<BitString> {
    override fun decode(decoder: TlbDecoder): BitString {
        val bits = bitsCount.decode(decoder)
        println("start decode bitstring: $bits")
        val result = decoder.reader.readBitString(bits)
        println("end decode bitstring: $bits - result: ${result.toString(true)}")
        return result
    }

    override fun toString(): String = "(bits $bitsCount)"
}

fun TypeExpression<*>.bitString(bitsCount: Int) = BitStringType(constant(bitsCount))
fun TypeExpression<*>.bitString(bitsCount: TypeExpression<Int>) = BitStringType(bitsCount)
fun TypeExpression<*>.bits(bitsCount: Int) = bitString(bitsCount)
fun TypeExpression<*>.bits(bitsCount: TypeExpression<Int>) = bitString(bitsCount)
fun TypeExpression<*>.bits256() = bitString(256)

object AnyType : TypeExpression<BitString> {
    override fun decode(decoder: TlbDecoder): BitString =
        decoder.reader.readBitString(decoder.reader.bitString.bitSize - decoder.reader.pos)

    override fun toString(): String = "Any"
}

fun TypeExpression<*>.any() = AnyType


object CellType : TypeExpression<Cell> {
    override fun decode(decoder: TlbDecoder): Cell = decoder.cell
    override fun toString(): String = "Cell"
}

fun TypeExpression<*>.cell() = CellType
