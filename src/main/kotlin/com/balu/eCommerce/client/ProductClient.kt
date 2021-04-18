package com.balu.eCommerce.client

import com.balu.eCommerce.model.Product
import com.balu.eCommerce.model.ProductList
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import java.util.UUID

@FeignClient("ProductClient", url = "\${product.url:}")
interface ProductClient {

    @GetMapping("/{id}/")
    fun findProduct(@PathVariable id: UUID): Product

    @GetMapping("/")
    fun getProductList(@RequestParam("page") page: Long): ProductList
}