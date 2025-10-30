package com.pasteleria.micro_core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pasteleria.micro_core.service.CategoriaService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor

public class CategoriaController {

    private final CategoriaService categoriaService;
    
}
