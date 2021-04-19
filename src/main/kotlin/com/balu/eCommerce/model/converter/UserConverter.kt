package com.balu.eCommerce.model.converter

import com.balu.eCommerce.model.User
import com.balu.eCommerce.model.database.UserEntity
import java.util.UUID

class UserConverter {
    companion object {
        fun convert(user: User) =
                UserEntity(UUID.randomUUID(), user.name, user.email, setOf())

        fun convert(user: UserEntity) =
                User(user.name,
                    user.email,
                    user.favoriteProducts
                            .map { productEntity -> ProductConverter.convert(productEntity) }
                            .toSet())
    }
}