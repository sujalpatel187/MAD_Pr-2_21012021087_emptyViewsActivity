package com.sujalpatel.mad_pr_2_21012021087_emptyviewsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

 class MainActivity : AppCompatActivity() {
     val TAG="MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMesssage("On create method is called")
        var textview= findViewById<TextView>(R.id.text_view)
        textview.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        })


    }
     fun showMesssage(message:String){
         Log.i(TAG, message)
         Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

     }

     override fun onStart() {
         super.onStart()
         showMesssage("onStart method is called")
     }

     override fun onResume() {
         super.onResume()  
         showMesssage("onResume method is called")
     }

     override fun onPause() {
         super.onPause()
         showMesssage("onPause method is called")
     }

     override fun onRestart() {
         super.onRestart()
         showMesssage("onRestart method called")
     }

     override fun onStop() {
         super.onStop()
         showMesssage("onStop method is called")
     }

     override fun onDestroy() {
         super.onDestroy()
         Toast.makeText(this, "onDestroy method is called", Toast.LENGTH_SHORT).show()
     }
}