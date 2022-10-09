package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private List<Car> carList;

    public Winners(List<Car> carList) {
        this.carList = carList;
    }

    public List<Winner> get() {
        int maxPosition = 0;

        for (Car car : carList) {
            if (car.getPosition() >= maxPosition) {
                maxPosition = car.getPosition();
            }
        }

        List<Winner> winners = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPosition() == maxPosition) {
                winners.add(new Winner(car.getName()));
            }
        }

        return winners;
    }
}
