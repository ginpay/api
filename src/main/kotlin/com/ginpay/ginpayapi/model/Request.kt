package com.ginpay.ginpayapi.model

import javax.persistence.*

@Entity
@Table(name="user_travel")
class Request {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    @Column(name = "user_id")
    private var userId: String? = null

    fun getUserId(): String? {
        return userId
    }

    fun setUserId(userId: String?) {
        this.userId = userId
    }

    @Column(name = "destination_id")
    private var destinationId: Int = 0

    fun getDestinationId(): Int {
        return destinationId
    }

    fun setDestinationId(destinationId: Int) {
        this.destinationId = destinationId
    }

    @Column(name = "message")
    private var message: String? = null

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String?) {
        this.message = message
    }
}