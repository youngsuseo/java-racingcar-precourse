package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Winner;

import java.util.List;

public class OutputView {
    private static final String ERROR_MESSAGE = "[ERROR]";

    public static void printResult(List<Car> game) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : game) {
            stringBuilder.append(car.getName()).append(" : ");

            for (int i = 0; i < car.getPosition(); i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }

    public static void printWinner(List<Winner> winners1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("최종 우승자 : ");
        for (int i = 0; i < winners1.size(); i++) {
            if (i < winners1.size() - 1) {
                stringBuilder.append(winners1.get(i).getName()).append(", ");
                continue;
            }
            stringBuilder.append(winners1.get(i).getName());
        }
        System.out.println(stringBuilder);
    }

    public static void printErrorMessage(String test) {
        System.out.println(ERROR_MESSAGE + " " + test);
    }
}
