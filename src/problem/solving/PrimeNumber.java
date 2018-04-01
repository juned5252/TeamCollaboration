package problem.solving;

public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        for(int i=2; i<100000000; i++){
            if(isPrime(i)){
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Total prime number up to this point: " + counter);
    }
    public static boolean isPrime(int number){
        if(number % 2 == 0){
            return false;
        }
        for(int i=3; i*i<=number; i=i+2){
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
}
