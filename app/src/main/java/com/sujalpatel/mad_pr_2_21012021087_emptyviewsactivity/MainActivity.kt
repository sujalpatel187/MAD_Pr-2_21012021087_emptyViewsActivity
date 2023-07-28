 package com.sujalpatel.mad_pr_2_21012021087_emptyviewsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
     val TAG="MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMesssage("On create method is called")

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
}