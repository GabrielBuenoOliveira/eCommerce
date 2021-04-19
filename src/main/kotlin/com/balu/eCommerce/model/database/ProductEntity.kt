package com.balu.eCommerce.model.database

import java.io.Serializable
import java.util.UUID
import javax.persistence.Embeddable
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "favorite_product")
data class ProductEntity(
        @Id
        @EmbeddedId
        var id: Key,
        var name: String
) : Serializable

@Embeddable
data class Key(
        var productId: UUID,
        var userId: UUID
) : Serializable
