import java.math.BigDecimal;

public class MoneyUtil {
    public static String format(double money) {
        return format(money, "$");
    }

    public static String format(Double money, String simbol) {

        if(simbol == null){
            throw new IllegalArgumentException();
        }

        if (money < 0) {
            simbol = "-" + simbol;
            money *= -1;
        }


        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return simbol + rounded;
    }
}
