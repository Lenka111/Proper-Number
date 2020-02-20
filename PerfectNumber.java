
/*A perfect number is a positive integer which is equal to the sum of its
 proper positive divisors.Proper positive divisors are positive integers
 that fully divide the perfect number without leaving a remainder and exclude
  the perfect number itself.*/

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if(number < 1)
            return false;

        int sum= 0;

        for(int i = 1; i <= number/2; i++){

            if(number % i == 0)

                sum += i;

        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println( isPerfectNumber(24));
        System.out.println( isPerfectNumber(28));
    }
}