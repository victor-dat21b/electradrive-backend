package org.example.electradrivebackend.api;

import org.example.electradrivebackend.dto.CarResponse;
import org.example.electradrivebackend.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public Flux<CarResponse> getAllCars() {
        return carService.getAllCars();
    }
}
