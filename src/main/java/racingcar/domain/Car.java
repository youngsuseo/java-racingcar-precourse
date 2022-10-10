package racingcar.domain;

import racingcar.strategy.MovingStrategy;

public class Car {

    private final Name name;
    private Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(MovingStrategy movingStrategy) {
        this.position = position.move(movingStrategy);
    }
}
