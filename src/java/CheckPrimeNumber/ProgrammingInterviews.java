public class ProgrammingInterviews {
    
    public static void main(String[] args) {
      
        int input = 27;
        
        if(input < 0) {
            System.out.println("Wrong Input");
            return;
        }
        else if(input <= 1) {
            System.out.println("0 and 1 are not prime");
            return;
        }
        
        boolean isPrime = isPrimeNumber(input);
        
        if(isPrime) {
            System.out.println("Prime Number");
        }
        else {
        System.out.println("Not Prime Number");
        }
        
       
    }
    
    public static boolean isPrimeNumber(int input) {
        boolean isPrime = true;
        for(int i =2; i * i <= input; i++) {
            if(input % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
        
    }
    
}
