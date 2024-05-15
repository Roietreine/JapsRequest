package com.eperformax.japsrequest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.eperformax.japsrequest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var japsViewModel: JapsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val japsRepo = JapsRepo()
        val viewmodelProvider = ViewModelProviders(japsRepo,application)

        japsViewModel = ViewModelProvider(this,viewmodelProvider)[JapsViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)

        temporaryObservable()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun temporaryObservable(){
        val device = Device("","")
        val upiRequest = UpiRequest(device)
        japsViewModel.getUpiValue(upiRequest)

        japsViewModel.getUpiLivedata().observe(this){
            //Temporary value
            binding.tvSuccess.text = "Success"
        }

    }
}