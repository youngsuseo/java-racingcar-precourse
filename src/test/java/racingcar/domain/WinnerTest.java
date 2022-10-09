package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {

    @Test
    void construct() {
        String name = "car1";
        Winner winner = new Winner(name);
        assertThat(winner).isNotNull();
    }
}
