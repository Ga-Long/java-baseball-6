package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void 세_자리수_인지_확인() {
        String userNumbers = "1234";

        assertThatThrownBy(() -> {
            Validator.checkArrayLength(userNumbers);
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 숫자_범위_확인() {
        String userNumbers = "102";

        assertThatThrownBy(() -> {
            Validator.checkRange(userNumbers);
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 숫자_확인() {
        String userNumbers = "ㅇㅇ";

        assertThatThrownBy(() -> {
            Validator.checkArrayNumber(userNumbers);
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 숫자_중복_확인() {
        String userNumbers = "131";

        assertThatThrownBy(() -> {
            Validator.checkForDuplicateNumbers(userNumbers);
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 숫자_1_또는_2_인지_확인() {
        String userInput = "3";

        assertThatThrownBy(() -> {
            Validator.checkOneOrTwo(userInput);
        }).isInstanceOf(IllegalArgumentException.class);

    }
}
