package com.rnasser.dhaulas.RecyclerViewExercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rnasser.dhaulas.R

class MainActivityRecyclerExercicio : AppCompatActivity() {

    lateinit var viewPager: ViewPager2
    lateinit var fragmentAdapter: FragmentAdapter

    //var f1: Fragment01Recycler = Fragment01Recycler(FragmentAdapter(this).initList())
    var f1: Fragment01Recycler = Fragment01Recycler(FragmentAdapter(this).initList())

    lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_exercicio)

        viewPager = findViewById(R.id.view_pager)
        fragmentAdapter = FragmentAdapter(this)
        viewPager.adapter = fragmentAdapter

        tabs = findViewById(R.id.tabs)
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

    inner class FragmentAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> f1
                1 -> Fragment01Recycler(initList())
                else -> Fragment03Recycler(initList())
            }
        }

        fun initList(): MutableList<CardapioItem> {

            val itemList = mutableListOf<CardapioItem>()

            for (index in 0..10) {
                val item: CardapioItem
                item = CardapioItem(
                    "Item $index",
                    index.toFloat(),
                    "https://image.gplustogo.com.br/produto/347/t8446.jpg?v=1",
                    "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI"
                )
                itemList.add(item)
            }
            return itemList
        }

    }


}