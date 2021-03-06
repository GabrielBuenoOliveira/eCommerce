package com.balu.eCommerce.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.net.URL
import java.util.UUID

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class Product(
        val price: Double? = null,
        val image: URL? = null,
        val brand: String? = null,
        val id: UUID,
        val title: String,
        val reviewScore: Double? = null
) : Serializable

data class Metadata(
        @JsonProperty("page_number")
        val pageNumber: Long,
        @JsonProperty("page_size")
        val pageSize: Long
) : Serializable

data class ProductList(
        val meta: Metadata,
        val products: List<Product>
) : Serializable

