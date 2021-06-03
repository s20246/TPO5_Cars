package com.studia.TPO5.Controller;

import com.studia.TPO5.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TPO5Controller {
    @Autowired
    CarService carService;

    public TPO5Controller() {
    }

    public TPO5Controller(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(path = "/index")
    public String index() {
        System.out.println(carService.fetchRodzaj());
        System.out.println(carService.fetchCarsByRodzaj("osobowy"));
        return "index";
    }

    @GetMapping(path = "/carlist")
    //@RequestParam(name = "typeOfCar")
    public String carList(@RequestParam(name = "typeOfCar") String typeOfCar,
                          @RequestParam(name = "carBrand") String carBrand,
                          @RequestParam(name = "yearOfProduction") String yearOfProduction,
                          @RequestParam(name = "fuelConsumption") String fuelConsumption) {
        //moze List<Car> w argumentach, albo String typeOfCar
        //szukanie w bazie danych?

        return "carlist";
    }
}
