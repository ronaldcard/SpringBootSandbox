package com.foolishpuma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootSandboxApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSandboxApplication>(*args)
}
