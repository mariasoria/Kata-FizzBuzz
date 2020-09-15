import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {
    @Test
    public void shouldShowFizzBuzz5(){
        assertArrayEquals(new String []{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void shouldShowFizzBuzz10(){
        assertArrayEquals(new String []{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void shouldShowFizzBuzz15(){
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void shouldShowFizzBuzz20(){
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"}, FizzBuzz.fizzBuzz(20));
    }
}

