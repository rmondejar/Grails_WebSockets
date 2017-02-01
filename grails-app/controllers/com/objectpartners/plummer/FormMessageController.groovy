package com.objectpartners.plummer

import grails.converters.JSON
import org.springframework.messaging.simp.SimpMessagingTemplate

class FormMessageController {

    def SimpMessagingTemplate brokerMessagingTemplate

    def index() {
    }

    def String message() {

        String payload = [message:params.message, timestamp:new Date().getTime()] as JSON
        brokerMessagingTemplate.convertAndSend("/topic/formMessage", payload)

        render(view: "index")
    }
}