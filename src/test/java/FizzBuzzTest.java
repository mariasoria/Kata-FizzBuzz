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
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz"}, FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void shouldShowFizzBuzz20(){
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"}, FizzBuzz.fizzBuzz(20));
    }

    // Stage 2
    @Test
    public void show13AsFizz(){
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz"}, FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void show35AsFizzBuzz(){
        assertArrayEquals(new String [] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14",
                "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz"}, FizzBuzz.fizzBuzz(35));
    }
}

