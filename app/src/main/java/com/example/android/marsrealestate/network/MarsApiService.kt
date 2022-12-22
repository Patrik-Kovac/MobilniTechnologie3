
package com.example.android.marsrealestate.network

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MarsApiService {
    @GET("realestate")
    fun getProperties():
            Call<String>
}
object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java) }
}