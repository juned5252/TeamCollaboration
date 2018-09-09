package egypt;

public class Pyramid {   (Interesting pyramid)

    public static void main(String[] args) {
        makePyramid(5);
    }

    public static void makePyramid(int max){
        for (int i = 1; i<max; i+=1){
            for(int j=i; j<max-1; j++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
