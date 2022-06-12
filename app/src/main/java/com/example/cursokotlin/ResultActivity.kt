package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cursokotlin.databinding.ActivityMainBinding
import com.example.cursokotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnBack.setOnClickListener{onBackPressed()}
        getAndShowName()
    }

    private fun getAndShowName(){
        val bundle = intent.extras
        val name =bundle?.get("INTENT_NAME")
        mBinding.tvGreeting.text = "Bienvenido $name"
    }
}