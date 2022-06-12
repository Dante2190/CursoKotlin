package com.example.cursokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cursokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnshowName.setOnClickListener{ checkValue() }
    }

    private fun checkValue(){
        if (mBinding.edtName.text.isNotEmpty()){
            // vamas ala nueva pantalla
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", mBinding.edtName.text)
            startActivity(intent)
        }else {
            //mostramos un dialogo
            showErrorName()
        }
    }

    private fun showErrorName(){
        Toast.makeText(this, "el campo no puede estar vacio", Toast.LENGTH_SHORT).show()
    }
}