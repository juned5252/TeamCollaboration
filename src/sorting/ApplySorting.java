package sorting;

public class ApplySorting {
    public static void main(String[] args) {
        int [] array = {6,1,4,8,5,2,9,3};
        Sorting sort = new Sorting();
        sort.insertionSort(array);
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
