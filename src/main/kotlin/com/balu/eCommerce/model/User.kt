package com.balu.eCommerce.model

import java.io.Serializable

data class User(
        var name: String,
        var email: String,
        var favoriteProducts : Set<Product>
) : Serializable
