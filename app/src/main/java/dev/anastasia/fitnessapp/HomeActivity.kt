package dev.anastasia.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.anastasia.fitnessapp.databinding.ActivityEditProfileBinding
import dev.anastasia.fitnessapp.databinding.ActivityHomeBinding
import dev.anastasia.fitnessapp.databinding.ActivityLoginBinding


class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottonNav()

    }

    fun setupBottonNav(){
       binding.bottomNavigation.setOnItemSelectedListener{item->
            when(item.itemId){
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, PlanFragment()).commit()
                    true
                }
                R.id.Profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ProfileFragment()).commit()
                    true
                }
                else->false
            }
        }

    }
}

