package com.ginpay.ginpayapi.model

import javax.persistence.*


@Entity
@Table(name="user")
class User {
    @Id
    @Column(name = "id")
    private var id: String = ""

    fun getId(): String {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    @Column(name = "name")
    private var name: String = ""

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    @Column(name = "image")
    private var image: String? = null

    fun getImage(): String? {
        return image
    }

    fun setImage(image: String?) {
        this.image = image
    }

    @Column(name = "point")
    private var point: Double? = 0.0

    fun getPoint(): Double? {
        return point
    }

    fun setPoint(point: Double?) {
        this.point = point
    }
}