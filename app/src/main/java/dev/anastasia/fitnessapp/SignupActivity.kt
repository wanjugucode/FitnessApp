package dev.anastasia.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var tvLogIn:TextView
    lateinit var btnSignup:Button
    lateinit var tilFirstName: TextInputLayout
    lateinit var etFirstName: EditText
    lateinit var tilLastName: TextInputLayout
    lateinit var etLastName: EditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: EditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: EditText
    lateinit var tilConfirmPassword: TextInputLayout
    lateinit var etConfirmPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        tvLogIn=findViewById(R.id.tvLogIn)
        btnSignup=findViewById(R.id.btnSignup)
        tilFirstName = findViewById(R.id.tilFirstName)
        etFirstName = findViewById(R.id.etFirstName)
        tilLastName = findViewById(R.id.tilLastName)
        etLastName = findViewById(R.id.etLastName)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tilConfirmPassword = findViewById(R.id.tilConfirmPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)

        tvLogIn.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
       btnSignup.setOnClickListener {
           validateSignup()
       }

    }
    fun validateSignup() {
        var error=true
        var firstName = etFirstName.text.toString()
        var lastName = etLastName.text.toString()
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var confirmpassword = etConfirmPassword.text.toString()

        if (firstName.isBlank()) {
            etFirstName.error = "input is required"
        }
        if (lastName.isBlank()) {
            etLastName.error = "input is required"
        }

        if (email.isBlank()) {
            etEmail.error = "input is required"
        }

        if (password.isBlank()) {
            etPassword.error = "input is required"
        }

        if (confirmpassword.isBlank()) {
            etConfirmPassword.error = "input is required"
        }
        if (password!=confirmpassword){
            tilPassword.error="Passwords doesn't match "
        }
        if(!error){
            var intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}