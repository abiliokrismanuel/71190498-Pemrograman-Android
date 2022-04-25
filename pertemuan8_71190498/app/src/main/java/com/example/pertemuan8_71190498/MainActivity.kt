package com.example.pertemuan8_71190498

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan8_71190498.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        with(binding){
            viewPager.adapter = viewPagerAdapter

            TabLayoutMediator(tabLayout, viewPager){tab, position ->
                when(position){
                    0 -> tab.text = "Home"
                    1 -> tab.text = "Status"
                    2 -> tab.text = "panggilan"
                }
            }.attach()
        }
    }
}