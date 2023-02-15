package com.yasser.data.remote

import com.yasser.domain.entity.PostsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): PostsResponse
}