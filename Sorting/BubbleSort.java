package GFG.Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        boolean swap=false;
        //int p = passes
        for(int passes=0;passes<n-1;passes++){
            for(int j=1;j<n-passes;j++){
                //check if j is less than j-1 then swap
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;

                    swap=true;
                }
            }
            //swap is not true in pass 1 then break loop because is sorted
            if(!swap){
                break;
            }
        }
    }
}

