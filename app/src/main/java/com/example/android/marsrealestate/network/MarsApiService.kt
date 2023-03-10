
package com.example.android.marsrealestate.network
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

import retrofit2.Retrofit
import KotlinJsonAdapterFactory

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

interface MarsApiService {

    @GET("realestate")
    suspend fun getProperties(): List<MarsProperty>
}
object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java) }
}