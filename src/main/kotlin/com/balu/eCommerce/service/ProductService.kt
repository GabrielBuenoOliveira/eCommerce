package com.balu.eCommerce.service

import com.balu.eCommerce.client.ProductClient
import com.balu.eCommerce.model.Product
import com.balu.eCommerce.model.ProductList
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ProductService(val productClient: ProductClient) {

    fun findProduct(id: UUID): Product = productClient.findProduct(id)

    fun getProductList(page: Long = 1): ProductList = productClient.getProductList(page)

}