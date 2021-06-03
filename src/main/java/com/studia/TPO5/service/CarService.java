package com.studia.TPO5.service;

import com.studia.TPO5.entity.Car;
import com.studia.TPO5.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


//co to robi?
@Service
public class CarService{

    //nie trzeba tworzyc, nie bedzie null
    @Autowired
    CarRepository carRepository;

    public CarService() {
    }

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Set<String> fetchRodzaj() {
       return carRepository.findAll().stream()
               .map(Car::getRodzaj)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    public List<Car> fetchCarsByRodzaj(String rodzaj){
        return carRepository.findAll().stream()
                .filter(car -> car.getRodzaj().equals(rodzaj))
                .collect(Collectors.toList());
    }
}
