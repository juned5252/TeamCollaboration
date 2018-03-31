package swapping;

public class Swap {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 18;

        System.out.println("Before swapping");
        System.out.println(num1);
        System.out.println(num2);
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping");
        System.out.println(num1);
        System.out.println(num2);


    }
}
