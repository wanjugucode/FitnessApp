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
    lateinit var btnSignUp: Button
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
    lateinit var tvLogin: TextView
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
           var intent=Intent(this,HomeActivity::class.java)
           startActivity(intent)
           validateSignup()
       }
    }
    fun validateSignup() {
        var firstName = etFirstName.text.toString()
        var lastName = etLastName.text.toString()
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var confirmpassword = etConfirmPassword.text.toString()

        if (firstName.isBlank()) {
            etFirstName.error = "input required"
        }
        if (lastName.isBlank()) {
            etLastName.error = "input required"
        }

        if (email.isBlank()) {
            etEmail.error = "input required"
        }

        if (password.isBlank()) {
            etPassword.error = "input required"
        }

        if (confirmpassword.isBlank()) {
            etConfirmPassword.error = "input required"
        }
        if (password!=confirmpassword){
            tilPassword.error="Emails don't match "
        }
    }

}