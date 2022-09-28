@file:JvmName("DemoUtils")
package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import dev.pinkroom.walletconnectkit.WalletConnectKit
import dev.pinkroom.walletconnectkit.WalletConnectKitConfig
import kotlinx.android.synthetic.main.activity_main.*


class Connect : AppCompatActivity(R.layout.activity_main) {

        val config = WalletConnectKitConfig(
                context = this,
                bridgeUrl = "wss://bridge.aktionariat.com:8887",
                appUrl = "walletconnectkit.com",
                appName = "WalletConnectKit",
                appDescription = "WalletConnectKit is the Swiss Army toolkit for WalletConnect!"
        )
        val walletConnectKit = WalletConnectKit.Builder(config).build()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    // init screen
}