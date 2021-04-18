package com.balu.eCommerce.controller

import com.balu.eCommerce.model.Product
import com.balu.eCommerce.model.ProductList
import com.balu.eCommerce.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/products")
class ProductController(val productService: ProductService) {

    @GetMapping
    fun getProducts(@RequestParam page: Long): ProductList = productService.getProductList(page)

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: UUID): Product = productService.findProduct(id)
}

