package com.example.a20012011116_nishthapatel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showmessage(msg:String)
    {
        Log.i(tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showmessage("onStart is called....")
    }

    override fun onResume() {
        super.onResume()
        showmessage("onResume is called...")
    }
}