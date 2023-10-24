package GFG.Searching;
import java.util.Arrays;

public class LinearSearch {
    //Code Linear Search
    public static int Search(int arr[], int targetValue) {
        for (int i = 0; i < arr.length; i++) {
            //check Condition
            if (arr[i] == targetValue)
                return i + 1;
        }
        return -1;
    }

    //Main
    public static void main(String[] args) {
        int temp[] = {8, 3, 1, 5, 9, 2, 7, 6, 4};
        System.out.println(temp.length);
        System.out.println(Search(temp, 2));
    }
}

