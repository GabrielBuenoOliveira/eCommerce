package com.balu.eCommerce.repository

import com.balu.eCommerce.model.database.Key
import com.balu.eCommerce.model.database.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductEntity, Key> {
}