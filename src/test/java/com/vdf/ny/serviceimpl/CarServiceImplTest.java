package com.vdf.ny.serviceimpl;

import com.vdf.ny.utils.factory.CarFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class CarServiceImplTest {

  String mockCabrio= null;
  String mockSedan= null;
  String mockHatchback= null;
  String mockUpperChar= null;
  String wrongType=null;


  @InjectMocks
  private CarServiceImpl carService;

  @Mock
  CarFactory carFactory;

  @BeforeEach
  public void setUp() {
    mockCabrio="cabrio";
    mockSedan="sedan";
    mockHatchback="hatchback";
    mockUpperChar="CABRIO";
    wrongType="SDE";

     }


  @Test
  public void produceCarCarbio_thenOK() {

    final String result = carService.produceCar(mockCabrio);
    assertThat(result).isEqualTo("Cabrio Car has produced");

  }
  @Test
  public void produceCarSedan_thenOK() {
    final String result = carService.produceCar(mockSedan);
    assertThat(result).isEqualTo("Sedan Car has produced");

  }
  @Test
  public void produceCarHatcback_thenOK() {
    final String result = carService.produceCar(mockHatchback);
    assertThat(result).isEqualTo("Hatchback Car has produced");
  }
  @Test
  public void produceCarUpperLowerCase_thenOK() {
    final String result = carService.produceCar(mockUpperChar);
    assertThat(result).isEqualTo("Cabrio Car has produced");

  }
  @Test
  public void produceCarCheckWrongTypeError_thenOK() {
    assertThrows(IllegalArgumentException.class,
        ()->{
          carService.produceCar(wrongType);
        }
        );
  }



  }