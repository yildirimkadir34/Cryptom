package com.example.cryptom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import com.example.cryptom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentcontainerview)
        val navController=navHostFragment!!.findNavController()

        val popupMenu= PopupMenu(this,null)
        popupMenu.inflate(R.menu.bottom_nav_manu)
        binding.bottomBar.setupWithNavController(popupMenu.menu,navController)
    }
}