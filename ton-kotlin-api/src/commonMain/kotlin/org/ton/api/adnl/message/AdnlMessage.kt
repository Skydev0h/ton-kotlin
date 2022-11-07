@file:Suppress("OPT_IN_USAGE")

package org.ton.api.adnl.message

import kotlinx.serialization.Polymorphic
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import org.ton.tl.TlCodec
import org.ton.tl.TlCombinator
import org.ton.tl.TlObject

@Polymorphic
@Serializable
@JsonClassDiscriminator("@type")
sealed interface AdnlMessage : TlObject<AdnlMessage> {
    override fun tlCodec(): TlCodec<out AdnlMessage> = Companion

    companion object : TlCombinator<AdnlMessage>(
        AdnlMessageQuery,
        AdnlMessageAnswer,
        AdnlMessageCreateChannel,
        AdnlMessageConfirmChannel,
        AdnlMessageCustom,
        AdnlMessageNop,
        AdnlMessageReinit,
        AdnlMessagePart
    ) {
        fun sizeOf(message: AdnlMessage): Int = Int.SIZE_BYTES + when(message) {
            is AdnlMessageQuery -> AdnlMessageQuery.sizeOf(message)
            is AdnlMessageAnswer -> AdnlMessageAnswer.sizeOf(message)
            is AdnlMessageCreateChannel -> AdnlMessageCreateChannel.SIZE_BYTES
            is AdnlMessageConfirmChannel -> AdnlMessageConfirmChannel.SIZE_BYTES
            is AdnlMessageCustom -> AdnlMessageCustom.sizeOf(message)
            is AdnlMessageNop -> AdnlMessageNop.SIZE_BYTES
            is AdnlMessageReinit -> AdnlMessageReinit.SIZE_BYTES
            is AdnlMessagePart -> AdnlMessagePart.sizeOf(message)
        }
    }
}
