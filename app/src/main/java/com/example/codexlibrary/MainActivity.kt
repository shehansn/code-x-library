package com.example.codexlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.codexlibrary.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

   // lateinit var binding: FragmentHomeBinding

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        binding = FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.computing.setOnClickListener{
            replaceFragment(ComputingFragment())
        }*/

            //val computingFragment = ComputingFragment()
            //supportFragmentManager.beginTransaction().replace(R.id.mainContainer,computingFragment).commit()

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.mainContainer) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setupWithNavController(bottomNavigationView,navController)
    }

    fun handleSelection(view: View) {
       // Toast.makeText(context:this,text:"Image is Selected",Toast.LENGTH_SHORT).show();
    }

    /*private fun replaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainContainer,fragment)
        fragmentTransaction.commit()
    }*/

}