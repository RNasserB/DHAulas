package com.rnasser.dhaulas.aula29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rnasser.dhaulas.R

private const val NUM_PAGES = 3

class MainActivityAula29 : AppCompatActivity() {

    lateinit var viewPager: ViewPager2
    lateinit var fragmentAdapter: PagerAdapter

    lateinit var tabs: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_aula29)

        viewPager = findViewById(R.id.view_pager)
        fragmentAdapter = PagerAdapter(this)
        viewPager.adapter = fragmentAdapter

        tabs = findViewById((R.id.tabs))
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = "Salgados"
            } else if (position == 1) {
                tab.text = "Doces"
            } else {
                tab.text = "Bebidas"
            }
        }.attach()

    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    inner class PagerAdapter(fragmentActivityAula29: MainActivityAula29) :
        FragmentStateAdapter(fragmentActivityAula29) {
        override fun getItemCount(): Int {
            return NUM_PAGES
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> Fragment1Aula29()
                1 -> Fragment2Aula29()
                else -> Fragment3Aula29()
            }
        }
    }

}