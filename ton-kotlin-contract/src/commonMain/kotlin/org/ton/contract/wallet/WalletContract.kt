package org.ton.contract.wallet

import org.ton.contract.SmartContract
import kotlin.jvm.JvmField

public interface WalletContract : SmartContract {
    public companion object {
        @JvmField
        public val DEFAULT_WALLET_ID: Int = 698983191
    }
}
