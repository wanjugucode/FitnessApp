package dev.anastasia.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.anastasia.fitnessapp.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
            validateLogin()

        }
        binding.tvSignup.setOnClickListener {
            val intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
    fun validateLogin(){
        val error=false
        val email= binding.etEmail.text.toString()
        val password= binding.etPassword.text.toString()

        if (email.isBlank()){
            binding.etEmail.error="Email is required"

        }
        if (password.isBlank()){
            binding.etPassword.error="Password is required"
        }
        if(!error){

    }

}
}