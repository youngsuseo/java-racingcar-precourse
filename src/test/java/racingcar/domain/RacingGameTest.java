package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.strategy.SequentialMovingStrategy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;

    @BeforeEach
    void setUp() {
        Cars cars = new Cars("car1,car2,car3");
        Movement movement = new Movement("5");
        racingGame = new RacingGame(cars, movement);
    }

    @DisplayName("winner 객체 생성")
    @Test
    void construct() {
        Cars cars = new Cars("car1,car2,car3");
        Movement movement = new Movement("5");
        RacingGame racingGame = new RacingGame(cars, movement);
        assertThat(racingGame).isNotNull();
    }

    @DisplayName("game을 진행하여 자동차를 움직인다.")
    @Test
    void game() {
        List<Car> cars = racingGame.game(new SequentialMovingStrategy());
        assertThat(cars.get(0)).isEqualTo(new Car("car1", 1));
        assertThat(cars.get(1)).isEqualTo(new Car("car2", 1));
        assertThat(cars.get(2)).isEqualTo(new Car("car3", 1));
    }

    @Test
    void continuable() {
        RacingGame racingGame1 = new RacingGame(new Cars("car1"), new Movement("1"));
        assertThat(racingGame1.continuable()).isTrue();

        RacingGame racingGame2 = new RacingGame(new Cars("car1"), new Movement("0"));
        assertThat(racingGame2.continuable()).isFalse();
    }
}
