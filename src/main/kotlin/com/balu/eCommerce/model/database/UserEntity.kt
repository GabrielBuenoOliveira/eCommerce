package com.balu.eCommerce.model.database

import java.io.Serializable
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID,
        val name : String,
        @Column(unique = true)
        var email: String,
        @OneToMany(fetch = FetchType.LAZY)
        @JoinColumn(name = "userId")
        var favoriteProducts: Set<ProductEntity>
) : Serializable