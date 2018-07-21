package com.ginpay.ginpayapi.controller

import com.ginpay.ginpayapi.model.Destination
import com.ginpay.ginpayapi.model.Request
import com.ginpay.ginpayapi.model.User
import com.ginpay.ginpayapi.repository.DestinationRepository
import com.ginpay.ginpayapi.repository.RequestRepository
import com.ginpay.ginpayapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class GinpayController @Autowired constructor(private val userRepository: UserRepository, private val destinationRepository: DestinationRepository, private val requestRepository: RequestRepository){

    @GetMapping("/api/destinations")
    fun getDestination(): List<Destination> = destinationRepository.findAll()

    @GetMapping("/api/requests")
    fun getRequests(): List<Request> = requestRepository.findAll()

    @GetMapping("/api/user")
    fun getUser(@RequestParam(value = "id") id: String): User = userRepository.getOne(id)

    @PostMapping("/api/request")
    fun createRequest(@RequestBody request: Request): String {
        requestRepository.save(request)
        return "{'status': 'success'}"
    }

    @PostMapping("/api/user")
    fun createUser(@RequestBody user: User): String {
        userRepository.save(user)
        return "{'status': 'success'}"
    }

    @PostMapping("/api/message")
    fun createMessage(@RequestBody message: String): String {
        // TODO Watson API Call
        return "{'message': 'hoge'}"
    }

    @PostMapping("/api/evaluation")
    fun createEvaluation(@RequestBody evaluation: String): String {
        println(evaluation)
        return "{'status': 'success'}"
    }
}