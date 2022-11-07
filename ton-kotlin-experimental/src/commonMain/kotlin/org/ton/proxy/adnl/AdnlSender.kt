package org.ton.proxy.adnl

import org.ton.api.adnl.AdnlIdShort
import org.ton.api.pub.PublicKeyEd25519
import org.ton.tl.TLFunction
import org.ton.tl.TlCodec
import org.ton.tl.TlObject
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

interface AdnlSender {
    suspend fun message(
        destination: AdnlIdShort,
        payload: ByteArray
    )

    suspend fun query(
        destination: AdnlIdShort,
        payload: ByteArray,
        timeout: Duration = 5.seconds,
        maxAnswerSize: Int = Int.MAX_VALUE
    ): ByteArray

    @Suppress("UNCHECKED_CAST")
    suspend fun <Q : TLFunction<Q, A>, A: TlObject<A>> query(
        destination: AdnlIdShort,
        query: Q,
        timeout: Duration = 5.seconds,
        maxAnswerSize: Int = Int.MAX_VALUE
    ): A {
        val queryCodec = query.tlCodec() as TlCodec<Q>
        val answerCodec = query.resultTlCodec()

        val queryPayload = queryCodec.encodeBoxed(query)
        val answerPayload = query(destination, queryPayload, timeout, maxAnswerSize)

        return answerCodec.decodeBoxed(answerPayload)
    }
}
