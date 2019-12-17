package com.appdot.io.wikipediareader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appdot.io.wikipediareader.remotedata.WikipediaService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = WikipediaService.Factory.create()
        apiService.user
    }

}
