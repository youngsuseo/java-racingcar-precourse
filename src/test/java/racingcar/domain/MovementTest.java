package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovementTest {

    @DisplayName("Movement 객체 생성")
    @Test
    void construct() {
        String tryNo = "3";
        Movement movement = new Movement(tryNo);
        assertThat(movement).isNotNull();
    }
}
