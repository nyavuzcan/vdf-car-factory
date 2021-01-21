package com.vdf.ny.serviceimpl;

import com.vdf.ny.service.CarService;
import com.vdf.ny.type.GeneralEnumerationDefinition.CarType;
import com.vdf.ny.utils.factory.CarFactory;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
  @Override
  public String produceCar(String carType) {
    return CarFactory.getInstance(CarType.valueOf(carType.toUpperCase(new java.util.Locale("en", "EN"))))
        .getType();
  }
}
