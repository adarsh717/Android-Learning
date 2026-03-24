package com.example.firstapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//    lateinit var login: Button
//    lateinit var signup: Button
//    lateinit var name: EditText
//    lateinit var txt: TextView
//    lateinit var homebutton: Button
//    lateinit var profilebutton: Button

    lateinit var Name: TextView
    lateinit var age: TextView
    lateinit var submit: Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Name=findViewById(R.id.NameText)
        age=findViewById(R.id.AgeText)
        submit=findViewById(R.id.Submit)

        submit.setOnClickListener {
            val student= Intent(this,ShowDetail::class.java)
            student.putExtra("name",Name.text.toString())
            student.putExtra("Age",age.text.toString())
            startActivity(student)
        }

//        homebutton=findViewById<Button>(R.id.homebutton)
//        profilebutton=findViewById<Button>(R.id.profilebutton)
//
//        val homefragment = HomeFragment.newInstance("Hello","Home fragment")
//        val profilefragment= profile.newInstance("Hello","Profile fragment")
//        homebutton.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.home_container,homefragment).commit()
//    }
//
//        profilebutton.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.home_container,profilefragment).commit()
//        }


    }
}