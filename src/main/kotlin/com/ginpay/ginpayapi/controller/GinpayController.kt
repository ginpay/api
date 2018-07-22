package com.ginpay.ginpayapi.controller

import com.ginpay.ginpayapi.model.Chat
import com.ginpay.ginpayapi.model.Destination
import com.ginpay.ginpayapi.model.Request
import com.ginpay.ginpayapi.model.User
import com.ginpay.ginpayapi.repository.DestinationRepository
import com.ginpay.ginpayapi.repository.RequestRepository
import com.ginpay.ginpayapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.ibm.watson.developer_cloud.assistant.v1.Assistant
import com.ibm.watson.developer_cloud.assistant.v1.model.InputData
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageOptions


@RestController
@RequestMapping("/")
@CrossOrigin
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
    fun createMessage(@RequestBody caht: Chat): String {
        val service = Assistant("2018-07-10")
        service.setUsernameAndPassword("name", "pass")

        val workspaceId = "workspace_id"

        var newMessageOptions = MessageOptions.Builder()
                .workspaceId(workspaceId)
                .input(InputData.Builder(caht.getMessage()).build())
                .build()

        var response = service.message(newMessageOptions).execute()

        return "{'message': '" + response.output.text.get(0) + "'}"
    }

    @PostMapping("/api/evaluation")
    fun createEvaluation(@RequestBody evaluation: String): String {
        println(evaluation)
        return "{'status': 'success'}"
    }
}