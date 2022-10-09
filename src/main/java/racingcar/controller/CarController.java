package racingcar.controller;

import racingcar.domain.*;
import racingcar.service.CarService;
import racingcar.strategy.RandomMovingStrategy;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarController {
    private static final CarController carController = new CarController();

    public static CarController getInstance() {
        return carController;
    }

    public void game() {
        CarService carService = CarService.getInstance();
        carService.game();
    }
}
