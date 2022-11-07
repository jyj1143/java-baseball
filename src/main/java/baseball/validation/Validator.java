package baseball.validation;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static final int MAX_VALUE = 9;
    private static final int MIN_VALUE = 1;
    private static final int COUNT_VALUE = 3;

    public static void validatePlayerInput(String input) {
        validateInputLength(input);
        validateInputInteger(input);
        validateInputNumberScope(input);
    }

    public static void validateInputLength(String input) {
        if (input.length() != COUNT_VALUE) {
            throw new IllegalArgumentException("[IllegalArgumentException]: " + COUNT_VALUE + "자리 자리자연수가 아닙니다.\n");
        }
    }

    public static void validateInputInteger(String input) {
        for (int i = 0; i < COUNT_VALUE; i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException("[IllegalArgumentException]: 정수가 아닙니다.\n");
            }
        }
    }

    public static void validateInputNumberScope(String input) {
        for (Character character : input.toCharArray()) {
            if (MIN_VALUE > Character.getNumericValue(character)
                    || Character.getNumericValue(character) > MAX_VALUE) {
                throw new IllegalArgumentException("[IllegalArgumentException]: 각 자릿수가 " + MIN_VALUE + "~" + MAX_VALUE + "사이 숫자가 아닙니다.\n");
            }
        }
    }


}
