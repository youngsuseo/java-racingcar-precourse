package racingcar.domain;

import racingcar.strategy.MovingStrategy;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RacingGame {
    private static final List<Car> DONE = null;

    private final Cars cars;
    private Movement movement; // FIXME final로 했을 때 어떻게 될지?

    public RacingGame(Cars cars, Movement movement) {
        this.cars = cars;
        this.movement = movement;
    }

    public List<Car> game(MovingStrategy movingStrategy) {
        if (!continuable()) { // FIXME done으로 변경할 수도 있음 ->
            return DONE;
        }
        cars.move(movingStrategy);
//        RacingGame racingGame = new RacingGame(cars, movement.move());
        movement = movement.move();

        return Collections.unmodifiableList(cars.getCarList());
    }

    public boolean continuable() {
        return movement.continuable();
    }
}
