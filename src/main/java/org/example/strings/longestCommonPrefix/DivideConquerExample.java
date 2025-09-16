package org.example.strings.longestCommonPrefix;


//    findMax(0,4)
//     ├── findMax(0,2)
//     │    ├── findMax(0,1)
//     │    │    ├── findMax(0,0) = 2
//     │    │    └── findMax(1,1) = 7
//     │    │    => 7
//     │    └── findMax(2,2) = 1
//     │    => 7
//     └── findMax(3,4)
//          ├── findMax(3,3) = 8
//          └── findMax(4,4) = 3
//        => 8
//        => max(7,8) = 8


public class DivideConquerExample {
    public static int findMax(int[] arr, int l, int r){
        if(l == r) return arr[l];

        int mid = (l+r)/2;

        int leftMax = findMax(arr, l, mid);
        int rightMax = findMax(arr, mid+1, r);

        return Math.max(leftMax, rightMax);

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 8, 3};
        System.out.println(findMax(nums, 0, nums.length - 1)); // 8
    }
}



