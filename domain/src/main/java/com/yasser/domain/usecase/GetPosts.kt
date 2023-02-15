package com.yasser.domain.usecase

import com.yasser.domain.repo.PostsRepo

class GetPosts(private val PostsRepo: PostsRepo) {
    suspend operator fun invoke() = PostsRepo.getPostsFromRemote()
}
