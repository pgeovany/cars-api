package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/car")
public class CarController {
  
  @PostMapping
  public void create(@RequestBody CarDTO request) {
    System.out.printf("Modelo: %s %nFabricante: %s %nAno: %d", request.modelo(), request.fabricante(), request.anoModelo());
  }
}
