package com.objectpartners.plummer

import grails.converters.JSON
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo

class ChatController {

    /**
     * Accepts incoming chat messages sent by browsers and routes them
     * to the 'chat' topic that all browser clients are subscribed to.
    **/
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    protected String chat(String chatMsg) {
        [message:chatMsg, timestamp:new Date().getTime()] as JSON
    }
}
