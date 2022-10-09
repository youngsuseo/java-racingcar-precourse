package racingcar.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Movement {
    private static final Map<Integer, Movement> CACHED_MOVEMENT;

    static {
        CACHED_MOVEMENT = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            CACHED_MOVEMENT.put(i, new Movement(String.valueOf(i)));
        }
    }

    private final int tryNo;

    public Movement(String tryNo) {
        this.tryNo = Integer.parseInt(tryNo);
    }

    public boolean continuable() {
        return tryNo >= 1;
    }

    public Movement move() {
        return CACHED_MOVEMENT.get(tryNo - 1);
    }
}
