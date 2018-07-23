package com.ginpay.ginpayapi.model

import javax.persistence.*

@Entity
@Table
class Destination (
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column
        private var name: String = "",

        @Column
        private var image: String? = null,

        @Column
        private var point: Double? = 0.0,

        @Column
        private var description: String? = null
)