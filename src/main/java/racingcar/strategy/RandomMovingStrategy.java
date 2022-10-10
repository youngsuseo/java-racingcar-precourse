package racingcar.strategy;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovingStrategy implements MovingStrategy {

    @Override
    public boolean movable() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
