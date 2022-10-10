package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Objects;

public class Position {
    private static final int CRITERIA_NUMBER = 0;

    private final int position;

    public Position(int position) {
        if (position < CRITERIA_NUMBER) {
            throw new IllegalArgumentException("자동차의 위치는 음수가 될 수 없습니다.");
        }

        this.position = position;
    }

    public Position move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber < 4) {
            return this;
        }
        return new Position(position + 1);
    }

    public Position move(int number) {
        if (number < 4) {
            return this;
        }
        return new Position(position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
