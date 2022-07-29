package dev.anastasia.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.anastasia.fitnessapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lunchOnClick()
    }

fun lunchOnClick(){
       binding. tvLogIn.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
       binding.btnSignup.setOnClickListener {
           var intent=Intent(this,HomeActivity::class.java)
           startActivity(intent)
           validateSignup()
       }
}

    fun validateSignup() {
        val error=false
        val firstName =binding. etFirstName.text.toString()
        var lastName = binding.etLastName.text.toString()
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var confirmpassword = binding.etConfirmPassword.text.toString()

        if (firstName.isBlank()) {
            binding.etFirstName.error = "input is required"
        }
        if (lastName.isBlank()) {
            binding.etLastName.error = "input is required"
        }

        if (email.isBlank()) {
            binding.etEmail.error = "input is required"
        }

        if (password.isBlank()) {
            binding. etPassword.error = "input is required"
        }

        if (confirmpassword.isBlank()) {
            binding. etConfirmPassword.error = "input is required"
        }
        if (password!=confirmpassword){
            binding. tilPassword.error="Passwords doesn't match "
        }
        if(!error){

        }
    }

}