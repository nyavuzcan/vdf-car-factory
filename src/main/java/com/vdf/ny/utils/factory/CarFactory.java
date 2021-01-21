package com.vdf.ny.utils.factory;

import com.vdf.ny.type.GeneralEnumerationDefinition;

public class CarFactory {
  public static Car getInstance(GeneralEnumerationDefinition.CarType carType) {
    switch (carType) {
      case SEDAN:
        return new Sedan();
      case HATCHBACK:
        return new Hatchback();
      case CABRIO:
        return new Cabrio();
      default:
        throw new IllegalArgumentException();
    }

  }
}
