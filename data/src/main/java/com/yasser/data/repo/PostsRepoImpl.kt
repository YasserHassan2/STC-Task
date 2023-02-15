package com.yasser.data.repo

import com.yasser.data.remote.ApiService
import com.yasser.domain.entity.PostsResponse
import com.yasser.domain.repo.PostsRepo

class PostsRepoImpl(private val apiService: ApiService) : PostsRepo {
    override suspend fun getPostsFromRemote(): PostsResponse = apiService.getPosts()
}