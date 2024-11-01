package lotto.domain.util;

import static lotto.domain.Lotto.TICKET_PRICE;

public final class MoneyParser {

    private final static String DECIMAL_COMMA = ",";

    private MoneyParser() {}

    public static Integer parse(String input) {
        int money = Integer.parseInt(removeComma(input));

        if (money < 0) {
            throw new IllegalArgumentException();
        }

        if (money % TICKET_PRICE != 0) {
            throw new IllegalArgumentException();
        }

        return money / TICKET_PRICE;
    }

    private static String removeComma(String input) {
        return String.join("", input.split(DECIMAL_COMMA));
    }
}