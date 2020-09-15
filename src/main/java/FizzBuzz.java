public class FizzBuzz {
    public static String[] fizzBuzz(int number){
        String[] fizzBuzz = new String[number];

        for(int i = 1; i < number+1; i++)
        {
            if((i % 3 == 0) && (i % 5 == 0)) fizzBuzz[i-1] = "FizzBuzz";
            else if (i % 3 == 0) fizzBuzz[i-1] = "Fizz";
            else if (i % 5 == 0) fizzBuzz[i-1] = "Buzz";
            else fizzBuzz[i-1] = Integer.toString(i);
            System.out.println(fizzBuzz[i-1]);
        }
        return fizzBuzz;
    }
}
