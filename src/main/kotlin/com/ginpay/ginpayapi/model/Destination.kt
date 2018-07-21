package com.ginpay.ginpayapi.model

import javax.persistence.*

@Entity
@Table(name="destination")
class Destination {
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

    @Column(name = "description")
    private var description: String? = null

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }
}