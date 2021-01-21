package com.vdf.ny.controller;

import com.vdf.ny.model.CarRequest;
import com.vdf.ny.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car")
public class CarController {
  @Autowired
  CarService carService;

  @RequestMapping(value = "/produce", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  String readCsvAndRegister(@RequestBody CarRequest carRequest) {
    return carService.produceCar(carRequest.getCarType());

  }

}
