package com.moj.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.buttonA
import kotlinx.android.synthetic.main.activity_main2.buttonB

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttonA.setOnClickListener {
            var fragment = FirstFragment()
            var manager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView3, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        buttonB.setOnClickListener {
            var fragment = SecondFragment()
            var manager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView3, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}