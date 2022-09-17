public class BubbleSort extends SortingAlogorithm {

    @Override
    public void sort(int[] arr, int n){

        for(int i=0;i<n;++i){
            for(int j=0;j<n-i-1;++j){
                 if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                 }
            }
        }
    }

    public void swap(int[] arr, int l, int r){
           int temp = arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
    }
}
