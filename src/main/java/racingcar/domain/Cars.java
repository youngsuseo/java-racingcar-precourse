package racingcar.domain;

import racingcar.strategy.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static final int INITIAL_POSITION = 0;
    private List<Car> carList;

    public Cars(String names) {
        carList = new ArrayList<>();
        String[] splitNames = names.split(","); // FIXME 공백제거
        for (String splitName : splitNames) {
            carList.add(new Car(splitName.trim(), INITIAL_POSITION));
        }
    }

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() { // FIXME 추후 테스트에서만 사용하면 제거
        return carList;
    }

    public void move() {
        for (Car car : carList) {
            car.move();
        }
    }

    public void move(MovingStrategy movingStrategy) {
        for (Car car : carList) {
            car.move(movingStrategy);
        }
    }
}
