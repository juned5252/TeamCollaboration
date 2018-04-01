package sorting;

public class Sorting {
    public int[] insertionSort(int [] array){
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
        return array;
    }

    public int[] mergeSort(int[] array){

        return array;
    }

    public int[] divide(int [] array){
        return array;
    }
    public int[] conquer(int [] array){
        return array;
    }
}
