package tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            numbers.add(getNumber(i));
        }

        return numbers;
    }

    private String getNumber(int i) {
        if (isMultipleX(i, 3, 5)) {
            return FIZZ + BUZZ;
        } else if (isMultipleX(i, 3)) {
            return FIZZ;
        } else if (isMultipleX(i, 5)) {
            return BUZZ;
        }
        return String.valueOf(i);
    }

    private boolean isMultiple(int number, int mod){
        return number % mod == 0;
    }

    private boolean isMultipleX(int number, int... mod){
//        AtomicBoolean isMultiple = new AtomicBoolean(false);
//        Arrays.stream(mod).forEach(i -> {
//            isMultiple.set(number % i == 0);
//        });

        return Arrays.stream(mod)
                .filter(c -> number % c == 0).count() == mod.length;
    }
}
