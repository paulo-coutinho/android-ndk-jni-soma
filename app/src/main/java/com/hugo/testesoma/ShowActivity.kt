package com.hugo.testesoma

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hugo.testesoma.databinding.ActivityShowBinding


class ShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resultOfSum.text = intent.extras?.getInt("sum").toString()
    }

}