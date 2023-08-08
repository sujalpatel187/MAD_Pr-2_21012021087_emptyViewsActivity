package com.sujalpatel.mad_pr_2_21012021087_emptyviewsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
     val tag="MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMesssage("On create method is called")
    }
     fun showMesssage(message:String){
         Log.i(tag, message)
         Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
         val obj:ConstraintLayout?=findViewById(R.id.mainConstraint)
         if(obj!= null){
             Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
         }
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
        showMesssage("onDestroy method is called")
    }
}