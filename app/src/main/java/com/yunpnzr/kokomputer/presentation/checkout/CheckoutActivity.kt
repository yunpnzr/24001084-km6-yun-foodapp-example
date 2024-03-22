package com.yunpnzr.kokomputer.presentation.checkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yunpnzr.kokomputer.databinding.ActivityCheckoutBinding

class CheckoutActivity : AppCompatActivity() {

    private val binding: ActivityCheckoutBinding by lazy {
        ActivityCheckoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}