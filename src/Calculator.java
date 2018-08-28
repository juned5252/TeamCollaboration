public class Calculator {
   static OnOFF onoff=new OnOFF();

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

    public boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public class OnOFF{}
        String push=null;

   void powerOn(){
       if(push==0)
       System.out.println("Calculator is On and usable");
        if(push!=0) System.out.println("Error message is played  :push right button);
    }
    void powerOff(){
        if(push==1) System.out.println("Calculator is Off and displays nothing");
        if(push!=1) System.out.println("Error message is played  :push right button);

    }



}
