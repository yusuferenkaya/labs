public class FindPrimes {

    public static void main(String[] args) {

        int given = Integer.parseInt(args[0]);

        for (int number = 2; number < given; number++){

           boolean isPrime = true;

           for(int divisor = 2; divisor < number; divisor++) {

               if (number % divisor == 0) {

                   isPrime = false;

                   break;

               }

           }

               if (isPrime)
                   System.out.print(number + " ");


           }





        }








     }





