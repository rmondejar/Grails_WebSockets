# Grails 3.2 WebSockets
Example of WebSockets usage in Grails 3.2.x using the grails-spring-websocket plugin, SockJS, and StompJS. 

##Description
The basic premise of the application is a Stock Ticker and Chat Room. Upon opening the webpage the browser attempts to establish a series of connections via WebSocket back to the server to listen for subscribed data. On startup the server component launches a Quartz job to generate random stock quotes. Each web client can subscribe or unsubscribe from these updates at-will. If any user sends a chat message it is routed via the server to any other open web clients to act as a chat room.

The main page supplies options to subscribe to stock quotes. Any number of browser tabs you open and subscribe will get the same data broadcast to them at the same time. There is also a chat option - any open browser tab will display the chat messages from any other client.

###Private Messages
By accessing http://localhost:8080/secure you can try out user-directed messages. This stack has the ability to send messages to a specific user and this page demonstrates that. Spring Security has been enabled for this page so you will be prompted to login - use either user/password or user2/password. In the background a private message is sent to "user" every 10 seconds. By logging in as user you should receive these messages; if you open a separate browser and login as user2 you will not see them.

##Tools
### grails-spring-websocket
From the [Plugin repository] (https://github.com/zyro23/grails-spring-websocket)

### Stomp
From the [Stomp docs](http://jmesnil.net/stomp-websocket/doc/)

### SockJS
From the [SockJS docs](https://github.com/sockjs/sockjs-client)

##Licensing
This code is provided under the terms of the MIT license: basically you're free to do whatever you want with it, but no guarantees are made to its validity, stability, or safety. All works referenced by or utilized by this project are the property of their respective copyright holders and retain licensing that may be more restrictive.

The original blog post for this example was written for: https://objectpartners.com/2015/06/10/websockets-in-grails-3-0/
