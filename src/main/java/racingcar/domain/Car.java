package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.strategy.MovingStrategy;

import java.util.Objects;

public class Car {

    private String name; // FIXME 객체 포장
    private int position;

    public Car(String name, int position) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("TEST");
        }

        this.name = name;
        this.position = position;
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber < 4) {
            return;
        }
        position++;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.move()) {
            position++;
        }
    }

    public void move(int randomNumber) {
        if (randomNumber < 4) {
            return;
        }
        position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() { // FIXME 메시지 보내는 형태로
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
