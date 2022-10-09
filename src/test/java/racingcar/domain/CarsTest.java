package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @DisplayName("Cars 객체 생성")
    @Test
    void construct() {
        String carsString = "car1, car2,car3";
        Cars cars = new Cars(carsString);
        assertThat(cars.getCarList()).hasSize(3);
    }
}
