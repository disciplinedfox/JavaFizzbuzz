public class FizzBuzz {

    public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
        // for divisible by 3:
        if (i % 3 == 0 && i % 5 == 0) 
        {
          System.out.println("FizzBuzz");
        }
        else if (i % 3 == 0) 
        {
          System.out.println("Fizz");
        //for divisible by 5:
        } 
        else if (i % 5 == 0) 
        {
          System.out.println("Buzz");
        }
        else 
        {
        System.out.println(i);
        }
      }
    }
  }