package com.studia.TPO5;

import com.studia.TPO5.entity.Car;
import com.studia.TPO5.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tpo5Application {

	public static void main(String[] args) {
		SpringApplication.run(Tpo5Application.class, args);
	}

	@Bean
	CommandLineRunner runner(CarRepository repository){
		return args -> {
			repository.save(new Car("osobowy", "Fiat", 2015, 5.5));
			repository.save(new Car("osobowy", "Renault", 2018, 6.5));
			repository.save(new Car("osobowy", "BMW", 2020, 7));
			repository.save(new Car("ciezarowy", "Volovo", 2013, 5));
			repository.save(new Car("ciezarowy", "Renault", 2017, 6.5));
			repository.save(new Car("ciezarowy", "Mercedes", 2018, 6));
			repository.save(new Car("F1", "BMW", 2020, 7));
			repository.save(new Car("F1", "Maserati", 2016, 7.5));
			repository.save(new Car("F1", "Spirit", 2014, 5.5));
			repository.save(new Car("dostawczy", "Fiat", 2015, 7));
			repository.save(new Car("dostawczy", "Renault", 2020, 5.5));
			repository.save(new Car("dostawczy", "Mercedes", 2019, 5));

		};
	}

}
