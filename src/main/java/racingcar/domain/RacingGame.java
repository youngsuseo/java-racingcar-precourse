package racingcar.domain;

import racingcar.strategy.MovingStrategy;

import java.util.Collections;
import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final Movement movement;

    public RacingGame(Cars cars, Movement movement) {
        this.cars = cars;
        this.movement = movement;
    }

    public List<Car> game(MovingStrategy movingStrategy) {
        for (int i = 0; i < movement.getRound(); i++) {
            cars.move(movingStrategy);
        }
        return Collections.unmodifiableList(cars.getCarList());
    }

    public boolean continuable() {
        return movement.continuable();
    }
}
