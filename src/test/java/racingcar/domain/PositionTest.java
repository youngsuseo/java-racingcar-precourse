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

    @DisplayName("자동차가 정상적으로 이동하는지 확인한다.")
    @Test
    void move() {
        Position position = new Position(0);
        assertThat(position.move(3)).isEqualTo(new Position(0));
        assertThat(position.move(4)).isEqualTo(new Position(1));
    }

    @DisplayName("FunctionalInterface를 통한 move() 테스트 수행 ")
    @Test
    void moveWithMovingStrategy() {
        Position position = new Position(0);
        assertThat(position.move(() -> true)).isEqualTo(new Position(1));
    }
}
