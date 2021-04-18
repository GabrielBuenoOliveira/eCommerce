package com.balu.eCommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ECommerceApplication

fun main(args: Array<String>) {
	runApplication<ECommerceApplication>(*args)
}
