package GFG.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[],int targetValue){
        int start = 0,last =arr.length-1;
        while (start<=last){
            // here we can also write like this (start-last) but sometime int limit exceeded
            int mid = start + (last-start)/2;

            if (arr[mid] ==targetValue){
                return mid;
            }else if (arr[mid]<targetValue)
            {
                start = mid+1;
            }
            else
            {
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int temp[]= {1,2,3,4,5};
        System.out.println(Arrays.toString(temp));
        System.out.println(binarySearch(temp,2)); // return index if found if not then -1
    }
}
