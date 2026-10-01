package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller // Меняем на @Controller, чтобы отдавать HTML
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "index"; // Ищем файл index.html в папке templates
    }

    // Небольшой API для проверки, что сервер жив
    @GetMapping("/api/status")
    @ResponseBody
    public String status() {
        return "Java-сервер работает отлично! 🚀";
    }
}