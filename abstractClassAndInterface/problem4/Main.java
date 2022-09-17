import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortingAlogorithm bubbleSort = new BubbleSort();

        int [] arr ={20,10,2,4,6,8};

        bubbleSort.sort(arr, arr.length);

        System.out.println(Arrays.toString(arr)); 

        SortingAlogorithm selectionSort = new SelectionSort();
 
        int [] arr2 ={20,10,30,10,40};

        selectionSort.sort(arr2, arr2.length);
           
        System.out.println(Arrays.toString(arr2)); 
        
    }
}
