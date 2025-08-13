package br.com.fiap3espf.spring_boot_project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")

public class instrutorController {
    @PostMapping
    public void cadastrarInstrutor(String json) {
        System.out.println(json);
    }
}
