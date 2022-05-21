package SimpleJUnit;

import SimpleJUnit.MoneyUtil;
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyUtilTest() {
        String money = MoneyUtil.format(1000.0, "$");
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negative_MoneyUtil() {
        String money = MoneyUtil.format(-1000.0, "$");
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void simbol_Real_MoneyUtil() {
        String money = MoneyUtil.format(1000.0, "R$");
        Assert.assertEquals("R$1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void simbol_Null_MoneyUtil() {
        MoneyUtil.format(1000.0, null);

    }
}
