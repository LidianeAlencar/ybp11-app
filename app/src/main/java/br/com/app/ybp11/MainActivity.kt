package br.com.app.ybp11

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_membros -> {
                message.setText(R.string.title_membros)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_lojas -> {
                message.setText(R.string.title_lojas)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_home -> {
                message.setText(R.string.title_activity_main) 
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_calendario -> {
                message.setText(R.string.title_calendario)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_perfil -> {
                message.setText(R.string.title_perfil)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


    }

}
