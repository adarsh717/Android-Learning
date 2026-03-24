package com.example.firstapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
//    lateinit var login: Button
//    lateinit var signup: Button
//    lateinit var name: EditText
//    lateinit var txt: TextView

    lateinit var homebutton: Button
    lateinit var profilebutton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        homebutton=findViewById<Button>(R.id.homebutton)
        profilebutton=findViewById<Button>(R.id.profilebutton)

        val homefragment = HomeFragment.newInstance("Hello","Home fragment")
        val profilefragment= profile.newInstance("Hello","Profile fragment")
        homebutton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.home_container,homefragment).commit()
    }

        profilebutton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.home_container,profilefragment).commit()
        }
    }
}