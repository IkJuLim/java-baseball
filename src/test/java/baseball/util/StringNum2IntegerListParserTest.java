package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringNum2IntegerListParserTest {

    private static StringNum2IntegerListParser parser = new StringNum2IntegerListParser();

    @Test
    @DisplayName("정상 작동 파싱")
    void parse() {
        String stringNum = "346";
        List<Integer> parsed = parser.parse(stringNum);
        assertThat(parsed).containsExactly(3, 4, 6);
    }

    @Test
    @DisplayName("파싱중 길이로 인한 에러")
    public void parse_Illegal_length(){
        String stringNum = "3426";
        Assertions.assertThatThrownBy(() -> parser.parse(stringNum))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("파싱중 잘못된 입력 문자로 인한 에러")
    public void parse_Illegal_inputChar(){
        String stringNum = "3f6";
        Assertions.assertThatThrownBy(() -> parser.parse(stringNum))
                .isInstanceOf(IllegalArgumentException.class);
    }
}