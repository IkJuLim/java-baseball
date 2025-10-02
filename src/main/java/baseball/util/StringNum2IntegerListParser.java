package baseball.util;

import baseball.exception.IllegalInputNumberException;

import java.util.ArrayList;
import java.util.List;

public class StringNum2IntegerListParser {

    private static final int MAX_LENGTH = 3;

    public List<Integer> parse(String numString){
        if(numString.length() != MAX_LENGTH){
            throw new IllegalInputNumberException("잘못된 길이의 입력 입니다.");
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(char num : numString.toCharArray()) {
            if (num <= '9' && num >= '0') {
                list.add(num - '0');
            }
            else {
                throw new IllegalInputNumberException("숫자가 아닌 입력이 포함되어 있습니다.");
            }
        }
        return list;
    }
}
