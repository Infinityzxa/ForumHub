package com.example.forumhub.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicController {

    @GetMapping
    public String getAllTopics() {
        return "List of topics"; // Simulação para listagem de tópicos
    }

    @PostMapping
    public String createTopic() {
        return "Topic created"; // Simulação para criação de tópicos
    }
}
