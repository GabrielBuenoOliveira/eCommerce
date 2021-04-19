package com.balu.eCommerce.model.converter

import com.balu.eCommerce.model.Product
import com.balu.eCommerce.model.database.Key
import com.balu.eCommerce.model.database.ProductEntity
import java.util.UUID

class ProductConverter {
    companion object {
        fun convert(product: Product, userId: UUID): ProductEntity =
                ProductEntity(Key(productId = product.id, userId = userId), name = product.title)

        fun convert(product: ProductEntity): Product =
                Product(title = product.name, id = product.id.productId)
    }
}