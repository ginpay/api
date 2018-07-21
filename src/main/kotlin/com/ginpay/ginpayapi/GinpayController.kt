package com.ginpay.ginpayapi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class GinpayController {

    @GetMapping("/api/destinations")
    fun getDestination():String = "{[{'destination_id': 1,'name': '北海道','image': 's3 url','point': '0.12','description': '毎年、8月初旬に三浦市は三浦海岸納涼まつり花火大会を開催する。　夏の太陽が沈んだ後、3000発の花火が打ち上げられると夜空は輝きで彩られる。　夏祭りを満喫するのに欠かせないもの全てがここで楽しめる―太陽、砂浜、夜店の食べ物、綺麗な浴衣、そして花火。'}]}"

    @GetMapping(" /api/requests")
    fun getRequests():String = "{[{'user_id': '1qwertyutrdfvbnjki87tghu654e','user_name': '山田太郎','image': 'hoge','destination_id': 1,'message': '北海道の大自然に触れたい'}]}"

    @GetMapping("/api/user")
    fun getUser(@RequestParam(value = "id") id: Int): String = ""

    @PostMapping("/api/request")
    fun createRequest(@RequestBody request: String): String {
        println(request)
        return "{'status': 'success'}"
    }

    @PostMapping("/api/user")
    fun createUser(@RequestBody user: String): String {
        println(user)
        return "{'status': 'success'}"
    }

    @PostMapping("/api/message")
    fun createMessage(@RequestBody message: String): String {
        println(message)
        return "{'status': 'success'}"
    }

    @PostMapping("/api/evaluation")
    fun createEvaluation(@RequestBody evaluation: String): String {
        println(evaluation)
        return "{'status': 'success'}"
    }
}