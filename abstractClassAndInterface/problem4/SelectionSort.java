import java.util.Arrays;

public class SelectionSort extends SortingAlogorithm {
    
    @Override
    public void sort(int[] arr, int n) {
        for(int i=0;i<n;++i){
            int min = arr[i];
            for(int j=i+1;j<n;++j){
                 if(arr[j]<min){
                    min=arr[j];
                   swap(arr, i, j);
                 }
            }
        }
    }

    private void swap(int[] arr, int  l ,int r){
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
