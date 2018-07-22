package com.ginpay.ginpayapi.model

import javax.persistence.*

@Entity
@Table(name="chat")
class Chat {
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
    private var userId: String = ""

    fun getUserId(): String {
        return userId
    }

    fun setId(id: String) {
        this.userId = userId
    }

    @Column(name = "message")
    private var message: String = ""

    fun getMessage(): String {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }
}