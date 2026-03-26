package com.example.firstapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URI
import androidx.core.net.toUri

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

    lateinit var implicit: Button

    @RequiresApi(Build.VERSION_CODES.BAKLAVA)
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
        implicit=findViewById(R.id.implecent_intent)


        submit.setOnClickListener {
            val student= Intent(this,ShowDetail::class.java)
            student.putExtra("name",Name.text.toString())
            student.putExtra("Age",age.text.toString().toIntOrNull())
            startActivity(student)
        }
        implicit.setOnClickListener {
            var intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/adarsh_yadav04/"))
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            startActivity(intent)
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