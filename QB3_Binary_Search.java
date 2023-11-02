package Searching;

import java.util.function.BinaryOperator;

public class QB3_Binary_Search {


    public static int BinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 3, 4, 2, 4, 5, 7, 8, 9, 65, 4, 332, 2, 2, 44, 5,};
       System.out.println(BinarySearch(arr,65));
    }
}