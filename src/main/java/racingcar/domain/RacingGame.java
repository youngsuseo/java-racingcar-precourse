package racingcar.domain;

import java.util.Collections;
import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final Movement movement;

    public RacingGame(Cars cars, Movement movement) {
        this.cars = cars;
        this.movement = movement;
    }

    public List<Car> game() {
        for (int i = 0; i < movement.getRound(); i++) {
            cars.move();
        }
        return Collections.unmodifiableList(cars.getCarList());
    }
}
