package org.ton.crypto.random

import kotlin.random.Random

actual object SecureRandom : Random() {
    private val javaSecureRandom = java.security.SecureRandom.getInstanceStrong()

    override fun nextBits(bitCount: Int): Int = nextInt().takeUpperBits(bitCount)

    override fun nextInt(): Int = javaSecureRandom.nextInt()

    override fun nextBytes(array: ByteArray, fromIndex: Int, toIndex: Int): ByteArray {
        val tmp = ByteArray(toIndex - fromIndex)
        javaSecureRandom.nextBytes(tmp)
        tmp.copyInto(array, fromIndex)
        return array
    }
}
