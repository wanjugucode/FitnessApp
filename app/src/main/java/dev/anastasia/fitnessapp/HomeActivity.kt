package dev.anastasia.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView



class HomeActivity : AppCompatActivity() {
    lateinit var fcvHome:FragmentContainerView
    lateinit var bnvHome:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottonNav()
        fcvHome=findViewById(R.id.fcvHome)
        bnvHome=findViewById(R.id.bnvHome)
    }
    fun setupBottonNav(){
        bnvHome.setOnItemSelectedListener{item->
            when(item.itemId){
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                R.id.Profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                else->false
            }
        }

    }
}

