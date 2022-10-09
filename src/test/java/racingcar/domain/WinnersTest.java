package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    private List<Car> cars;

    @BeforeEach
    void setUp() {
        cars = new ArrayList<>();
        cars.add(new Car("car1", 0));
        cars.add(new Car("car2", 5));
        cars.add(new Car("car3", 3));
    }

    @DisplayName("Winner 객체를 생성한다.")
    @Test
    void construct() {
        Winners winners = new Winners(cars);
        List<Winner> winners1 = winners.get();
        assertThat(winners1).isNotNull();
    }

    @DisplayName("Winner 객체를 생성한다.")
    @Test
    void get() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 5));
        cars.add(new Car("car2", 5));
        cars.add(new Car("car3", 3));
        Winners winners = new Winners(cars);
        List<Winner> winners1 = winners.get();
        assertThat(winners1).isNotNull();
    }
}
