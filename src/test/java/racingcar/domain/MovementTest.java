package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class MovementTest {

    @DisplayName("자동자 경주를 진행할 횟수를 나타내는 클래스를 정상적으로 생성한다.")
    @Test
    void construct() {
        Movement movement = new Movement("5");
        assertThat(movement).isNotNull();
    }

    @DisplayName("숫자가 아닌 값으로 경기 횟수를 입력하면 예외가 발생한다.")
    @Test
    void constructWithNotANumber() {
        assertThatThrownBy(() -> new Movement("A")).isInstanceOf(NumberFormatException.class);
    }

    @DisplayName("경기 횟수로 양수가 아닌 값을 입력하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void constructWithNotPositiveNumber(int round) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Movement(round))
                .withMessageContaining("자동차 경주를 진행할 횟수는 1 이상이어야 합니다.");
    }
}
