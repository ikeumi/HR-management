package com.example.kotlinviewkensyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //login機能
        btnLogin.setOnClickListener(View.OnClickListener {
            loginHandle()
        })

        //新規登録機能
        gotoRegister.setOnClickListener(View.OnClickListener {

        })

    }
    fun loginHandle(){
        var email : String = inputEmail.text.toString()
        var paswords : String = inputEmail.text.toString()
        if (email=="admin@gmail.com"&&paswords == "123456"){

            Toast.makeText(this,"ログイン成功",Toast.LENGTH_LONG).show()
        }
    }
    fun singUp(){
        val intern = Intent(this,Register::class.java)
        startActivity(intern)
    }
}