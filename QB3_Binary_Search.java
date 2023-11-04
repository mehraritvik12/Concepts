package Searching;

import java.util.function.BinaryOperator;

public class QB3_Binary_Search {


    public static int BinarySearch(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;


        // find arr is ascending or descending

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
        //same case for both
            if (target == arr[mid]) {
                return mid;
            }


            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
//    if(arr[0]<arr[1]) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//    }
//    else{
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                end = mid - 1;
//            } else if (target < arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//    }
//        return -1;
//    }

    public static void main(String[] args) {


        int arr[] = {9,7,5,4,3,2,1};
       System.out.println(BinarySearch(arr,9));
    }
}