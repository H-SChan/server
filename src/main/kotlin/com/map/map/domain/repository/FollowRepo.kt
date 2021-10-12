package com.map.map.domain.repository

import com.map.map.domain.entity.Follow
import com.map.map.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface FollowRepo : JpaRepository<Follow, Long> {
    fun findByFollowerAndFollowing(follower: User, following:User): Follow?
}