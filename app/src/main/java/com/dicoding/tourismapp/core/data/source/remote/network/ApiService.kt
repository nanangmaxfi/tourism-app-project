package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by nanangmaxfi on 01/01/22.
 */
interface ApiService {
    @GET("list")
    fun getList(): Call<ListTourismResponse>
}