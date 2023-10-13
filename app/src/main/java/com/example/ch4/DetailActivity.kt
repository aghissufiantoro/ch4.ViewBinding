package com.example.ch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ch4.databinding.ActivityMainBinding
import com.example.ch4.databinding.DetailActivityBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: DetailActivityBinding
    private var mCounter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        withoutViewModel()
    }
    private fun withoutViewModel(){
        binding.btnPlus.setOnClickListener{
            mIncremmentCount()
        }
        binding.btnMin.setOnClickListener{
            mDecrementCount()
        }
    }

    private fun mIncremmentCount(){
        mCounter += 1
        updateUI()
    }

    private fun mDecrementCount(){
        mCounter.let {
            if (it > 0) mCounter -= 1
        }
        updateUI()
    }

    private fun updateUI(){
        binding.tvCount.text = mCounter.toString()
    }
}