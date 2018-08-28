public class Calculator {


    

    public static int add(int x, int y){
        return x+y;
    }

    public static int sub(int x, int y){
        return x-y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static double div(int x, double y){
        return x/y;
    }

    public static double sqrt(int a){
        return Math.sqrt((double) a);
    }

    public static double tripplert(int a){
        return Math.sqrt(Math.sqrt(a));
    }

    public static double sqr(int a,int b){
        return Math.pow(a,b);
    }

    public String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }





}
