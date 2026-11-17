class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
    int arr[]=new int [m+n];
    int j=0;
    for(int i=0;i<m;i++){
        arr[j]=nums1[i];
        j++;
    }
     for(int i=0;i<n;i++){
        arr[j]=nums2[i];
        j++;
    }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
}
Arrays.sort(arr);
 int len = arr.length;

    if(len % 2 != 0) {
        return arr[len/2];
    }
    else {
        return (arr[len/2] + arr[(len/2)-1]) / 2.0;
    }



    }
}