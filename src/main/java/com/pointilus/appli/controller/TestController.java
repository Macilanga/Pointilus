package com.pointilus.appli.controller;

import com.pointilus.appli.contants.AppliConstants;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin(origins = AppliConstants.angularUrl)
public class TestController {

	@GetMapping("/test")
	public @ResponseBody String test (){
		System.out.println("test");
		return "TEST";
	}

	@GetMapping("/cool-cars")
	public Collection<Car> coolCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(0, "Test 0"));
		cars.add(new Car(1, "Test 1"));
		cars.add(new Car(2, "Test 2"));
		cars.add(new Car(3, "Test 3"));
		return cars;
	}

	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	public class Car {
		@Id
		private int id;
		private String name;

		Car(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}
}
