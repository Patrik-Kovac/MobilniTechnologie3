
package com.example.android.marsrealestate.network
import com.squareup.moshi.Json

data class MarsProperty(
    val id: String, val img_src: @Json(name = "img_src") val imgSrcUrl: String,
    val type: String,
    val price: Double
)
