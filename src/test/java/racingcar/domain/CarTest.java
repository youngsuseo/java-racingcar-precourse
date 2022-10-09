package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.strategy.SequentialMovingStrategy;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @DisplayName("Car 생성")
    @Test
    void construct() {
        String name = "car1";
        int position = 0;
        Car car = new Car(name, position);
        assertThat(car).isEqualTo(new Car("car1", 0));
    }

    @DisplayName("random값을 입력하여 4이상이면 이동하고, 3 이하이면 이동하지 않는다.")
    @ParameterizedTest
    @CsvSource(value = {"3,0", "4,1"}, delimiter = ',')
    void move(int randomNumber, int expectedPosition) {
        Car car1 = new Car("car1", 0);
        car1.move(randomNumber);
        assertThat(car1).isEqualTo(new Car("car1", expectedPosition));
    }

    @DisplayName("MovingStrategy를 전달받아 정상적으로 움직이는지 확인한다.")
    @Test
    void moveWithStrategy() {
        Car car1 = new Car("car1", 0);
        car1.move(() -> true);
        assertThat(car1).isEqualTo(new Car("car1", 1));

        car1.move(new SequentialMovingStrategy());
        assertThat(car1).isEqualTo(new Car("car1", 2));
    }
}
