package com.appdot.io.wikipediareader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appdot.io.wikipediareader.model.WikiPage
import com.appdot.io.wikipediareader.model.WikiResult
import com.appdot.io.wikipediareader.remotedata.WikipediaService

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://en.wikipedia.org")
            .build()
            .create(WikipediaService::class.java)

   //     var wikipediaService: WikipediaService = retrofit.cr

      // retrofit.user.enqueue(object : retrofit2.Callback<Void>{})

       var repos: Call<WikiResult> = retrofit.user

        repos.enqueue(object :Callback<WikiResult>{

            override fun onResponse(call: Call<WikiResult>, response: Response<WikiResult>) {
                var wikiResult : WikiResult? = response.body()

                var wikiPage : WikiPage =
            }

            override fun onFailure(call: Call<WikiResult>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

}
