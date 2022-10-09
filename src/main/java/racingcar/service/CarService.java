package racingcar.service;

import racingcar.domain.*;
import racingcar.strategy.RandomMovingStrategy;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarService {
    private static final String ERROR_MESSAGE = "[ERROR]";

    public static final CarService carService = new CarService(); // FIXME s 싱글턴 패턴 확인

    public static CarService getInstance() {
        return carService;
    }

    public void game() {
        RacingGame racingGame = new RacingGame(getCars(), getMovement());
        Winners winners = new Winners(getGame(racingGame));
        OutputView.printWinner(winners.get());
    }

    private Cars getCars() {
        try {
            return new Cars(InputView.inputCarNames());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage("test");
            getCars();
        }
        return null; // FIXME s 어떻게 처리할지 고민
//        return new Cars("");
    }

    private Movement getMovement() {
        try {
            String numberOfMoves = InputView.inputNumberOfMoves();
            return new Movement(numberOfMoves);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage("test");
            getMovement();
        }
        return null; // FIXME s 어떻게 처리할지 고민
    }

    private List<Car> getGame(RacingGame racingGame) {
        List<Car> game = null;
        while (racingGame.continuable()) {
            game = racingGame.game(new RandomMovingStrategy());
            OutputView.printResult(game);
        }
        return game;
    }
}
