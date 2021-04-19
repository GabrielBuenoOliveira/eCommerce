package com.balu.eCommerce.service

import com.balu.eCommerce.model.User
import com.balu.eCommerce.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (val userRepository: UserRepository){

    fun findUser( email : String ) {
        userRepository.findByEmail(email)
    }

    fun createUser( user : User) {

    }
}