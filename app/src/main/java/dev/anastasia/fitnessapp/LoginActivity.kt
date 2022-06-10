package dev.anastasia.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var tvSignup:TextView
    lateinit var etEmail:TextView
    lateinit var etPassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin=findViewById(R.id.btnLogin)
        tvSignup=findViewById(R.id.tvSignup)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)

        btnLogin.setOnClickListener {
            var intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
            validateLogin()

        }
        tvSignup.setOnClickListener {
            var intent=Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }
    fun validateLogin(){
        val email= etEmail.text.toString()
        val password= etPassword.text.toString()

        if (email.isBlank()){
            etEmail.error="Email is required"

        }
        if (password.isBlank()){
            etPassword.error="Password is required"
        }
        else{

        }

    }

}