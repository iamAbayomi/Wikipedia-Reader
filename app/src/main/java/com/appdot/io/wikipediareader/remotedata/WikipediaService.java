package com.appdot.io.wikipediareader.remotedata;

import com.appdot.io.wikipediareader.model.WikiResult;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WikipediaService {

    @GET("/w/api.php?action=query&format=json&formatversion" +
            "=2&generator=random&grnnamespace=0&prop=pageimages|info" +
            "&grnlimit=10&inprop=url&pithumbsize=200")
    Call<WikiResult> getUser();

    class Factory{
        public static WikipediaService create(){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://en.wikipedia.org")
                    .build();

            return  retrofit.create(WikipediaService.class);
        }
    }

}
