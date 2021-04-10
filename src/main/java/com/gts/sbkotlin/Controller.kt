package com.gts.sbkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/testing")
class Controller {

    @GetMapping("/endpoint1")
    fun heyWorld(): String = "Ayye"


}