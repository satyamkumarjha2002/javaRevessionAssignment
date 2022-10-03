import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
        int[] arr = {10,1,40,2,0,5};

        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
     }

     static void mergeSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid,ub);
        }
     }

     static void merge(int[] arr, int lb, int mid, int ub){
             int x = lb;
             int y = mid+1;
             int index=0;
             int[] temp = new int[ub-lb];
             while(x<=mid&&y<=ub){
                  if(arr[x]<=arr[y]){
                    if(arr[x++]==1);
                  }else{
                    if(arr[y++]==1);
                  }
                  ++index;
             }
             while(x<=mid){
                temp[index++]=arr[x++];
             }
             while(y<=ub){
                temp[index++]=arr[y++];
             }
             index = lb;
             for(int i=0;i<temp.length;++i){
                arr[index++]=temp[i];
             }
        // System.out.println(Arrays.toString(temp));
     }
}



