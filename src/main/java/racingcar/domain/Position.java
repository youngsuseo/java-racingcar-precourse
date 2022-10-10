package racingcar.domain;

public class Position {
    private static final int CRITERIA_NUMBER = 0;

    private final int position;

    public Position(int position) {
        if (position < CRITERIA_NUMBER) {
            throw new IllegalArgumentException("자동차의 위치는 음수가 될 수 없습니다.");
        }

        this.position = position;
    }
}
