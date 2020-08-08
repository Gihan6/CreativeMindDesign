package com.qdreamcaller.creativeminddesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_waiting.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTabs()



    }

    private fun initTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(WaitingFragment(), "Waiting")
        adapter.addFragment(AcceptFragment(), "Accepted")
        adapter.addFragment(CanceledFragment(), "Canceled")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }



}
