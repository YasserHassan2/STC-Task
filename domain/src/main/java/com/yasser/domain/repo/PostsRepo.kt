package com.yasser.domain.repo

import com.yasser.domain.entity.PostsResponse

interface PostsRepo {
    suspend fun getPostsFromRemote(): PostsResponse
}