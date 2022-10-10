package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class PositionTest {

    @DisplayName("position 객체를 생성한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void construct(int positionIndex) {
        Position position = new Position(positionIndex);
        assertThat(position).isNotNull();
    }

    @DisplayName("position은 0이상의 숫자만 입력 가능하다.")
    @Test
    void constructWithNegativeNumber() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Position(-1))
                .withMessageContaining("자동차의 위치는 음수가 될 수 없습니다.");
    }
}
