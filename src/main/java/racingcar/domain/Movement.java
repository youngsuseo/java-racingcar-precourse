package racingcar.domain;

public class Movement {

    private final int round;

    public Movement(String round) {
        this(Integer.parseInt(round));
    }

    public Movement(int round) {
        if (round < 1) {
            throw new IllegalArgumentException("자동차 경주를 진행할 횟수는 1 이상이어야 합니다.");
        }

        this.round = round;
    }

    public int getRound() {
        return round;
    }
}
