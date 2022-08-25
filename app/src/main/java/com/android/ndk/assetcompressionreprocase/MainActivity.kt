package com.android.ndk.assetcompressionreprocase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.ndk.assetcompressionreprocase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("tag", "Opening bar.baz")
        assets.openFd("bar.baz")
        Log.d("tag", "Opening foo")
        assets.openFd("foo")
    }
}