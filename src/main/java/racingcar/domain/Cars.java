package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String NAME_SPLIT_DELIMITER = ",";
    private static final int INITIAL_POSITION = 0;

    private final List<Car> carList;

    public Cars(String names) {
        carList = new ArrayList<>();

        String[] splitNames = names.split(NAME_SPLIT_DELIMITER);
        for (String name : splitNames) {
            carList.add(new Car(name, INITIAL_POSITION));
        }
    }
}
