package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";


    private FizzBuzz game;
    @Before
    public void before(){
        game = new FizzBuzz();
    }

    @Test
    public void should_return_whenNotMultipleOf3or5(){

        List<String> numbers = game.getNumbers();

        Assert.assertEquals("1", numbers.get(1));
        Assert.assertEquals("2", numbers.get(2));
        Assert.assertEquals("4", numbers.get(4));
    }

    @Test
    public void should_return_FizzwhenMultipleOf3(){
        List<String> numbers = game.getNumbers();

        Assert.assertEquals(FIZZ, numbers.get(3));
        Assert.assertEquals(FIZZ, numbers.get(6));
        Assert.assertEquals(FIZZ, numbers.get(9));
        Assert.assertEquals(FIZZ, numbers.get(12));
    }

    @Test
    public void should_return_BuzzwhenMultipleOf5(){
        List<String> numbers = game.getNumbers();

        Assert.assertEquals(BUZZ, numbers.get(5));
        Assert.assertEquals(BUZZ, numbers.get(10));
        Assert.assertEquals(BUZZ, numbers.get(20));
        Assert.assertEquals(BUZZ, numbers.get(25));
    }

    @Test
    public void should_return_FizzBuzzwhenMultipleOf3and5(){
        List<String> numbers = game.getNumbers();

        Assert.assertEquals(FIZZ + BUZZ, numbers.get(15));
        Assert.assertEquals(FIZZ + BUZZ, numbers.get(30));
        Assert.assertEquals(FIZZ + BUZZ, numbers.get(60));
    }

}
