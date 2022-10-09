package racingcar.strategy;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovingStrategy implements MovingStrategy {

    @Override
    public boolean move() {
        return Randoms.pickNumberInRange(0, 9) >= 4; // 전략패턴 말고 FucntionalInterface로 구현
    }
}
