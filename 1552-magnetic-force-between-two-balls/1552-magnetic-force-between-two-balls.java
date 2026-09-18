class Solution {
    public int maxDistance(int[]arr, int k) {
      Arrays.sort(arr);
       int n=arr.length;
       int l=1;
       int r=arr[n-1]-arr[0];
       int ans=-1;
       while(l<=r){
          int mid =l+(r-l)/2;
          int c=cowes(arr,mid);
          if(c>=k){
              ans=mid;
              l=mid+1;
          }
          else r=mid-1;
       }
        return ans;
    }
    int cowes(int arr[],int d){
        int c=1;
        int p=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]-p>=d){
               c++;
               p=arr[i];
           }
        }
       return c;  
    }
}