package sorting;

public class UseInsertionSort {
    public static void main(String[] args) {
        int [] array = {6,1,4,8,5,2,9,3};
        int temp;
        for(int i=1; i<array.length; i++){
            for(int j=i; j>0; j--){
                if(array[j]<array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
