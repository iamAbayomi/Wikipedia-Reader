package com.appdot.io.wikipediareader.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WikiPage (
    @SerializedName("pageid")
    @Expose
    var pageid: Int?,
    @SerializedName("title")
    @Expose
    var title: String?,
    @SerializedName("fullurl")
    @Expose
    var fullurl: String?,
    @SerializedName("thumbnail")
    @Expose
    var thumbnail: WikiThumbnail?
)

