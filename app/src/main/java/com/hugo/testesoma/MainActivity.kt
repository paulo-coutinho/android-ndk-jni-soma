package com.hugo.testesoma

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hugo.testesoma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        //binding.sampleText.text = stringFromJNI()
        //binding.sampleText.text = somaFromJNI(1, 5).toString()

        binding.buttonSum.setOnClickListener {
            val result = "Resultado: " + somaFromJNI(binding.numA.text.toString().toInt(), binding.numB.text.toString().toInt()).toString()
            binding.sampleText.text = result
        }
    }

    /**
     * A native method that is implemented by the 'testesoma' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    external fun somaFromJNI(a: Int, b: Int): Int

    companion object {
        // Used to load the 'testesoma' library on application startup.
        init {
            System.loadLibrary("testesoma")
        }
    }
}