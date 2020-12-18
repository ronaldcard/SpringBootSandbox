package com.foolishpuma.ws.ping

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class PingController {
    private val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("ping")
    fun ping(): Boolean {
        logger.trace("entering PingController.ping()")
        return true
    }
}
