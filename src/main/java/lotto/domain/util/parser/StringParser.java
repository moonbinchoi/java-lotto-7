package lotto.domain.util.parser;

public interface StringParser<R> {

    R parse(String input);

    default boolean isNumeric(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

    default void validateNumeric(String s) {
        if (!isNumeric(s)) {
            throw new IllegalArgumentException();
        }
    }
}
