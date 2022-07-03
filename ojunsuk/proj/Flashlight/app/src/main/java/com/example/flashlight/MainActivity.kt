package com.example.flashlight

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flashlight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //val torch = Torch(this) -> 서비스를 사용해 플래시를 켤 수 있도록 수정

        binding.flashSwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                startService(Intent(this, TorchService::class.java).apply {
                    action = "on"
                })
                //torch.flashOn()
            } else {
                startService(Intent(this, TorchService::class.java).apply {
                    action = "off"
                })
            }
        }
    }
}