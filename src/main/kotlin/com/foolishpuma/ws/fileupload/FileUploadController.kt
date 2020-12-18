package com.foolishpuma.ws.fileupload

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("")
class FileUploadController {

    private val logger = LoggerFactory.getLogger(javaClass)

    @CrossOrigin(origins = ["http://localhost:8080", "http://localhost:4200"])
    @PostMapping("/upload")
    fun upload(@RequestParam("file") file: MultipartFile): ResponseEntity<String> {
        logger.trace("entering FileUploadController.upload()")
        logger.info("FileName: ${file.originalFilename}")

        return ResponseEntity.status(HttpStatus.OK).body("Received!!!")
    }
}
