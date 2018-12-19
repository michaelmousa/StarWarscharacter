package com.treehouse.starwarscharacter

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StarService {
    @GET("{user}")
    fun getUserDetails(@Path("user") userName: String): Call<StarUser>

}