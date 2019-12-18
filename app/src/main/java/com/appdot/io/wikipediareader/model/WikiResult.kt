package com.appdot.io.wikipediareader.model

import androidx.navigation.Navigator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WikiResult (
    @SerializedName("pages")
    @Expose
    val pages: ArrayList<WikiPage> = ArrayList()
)
