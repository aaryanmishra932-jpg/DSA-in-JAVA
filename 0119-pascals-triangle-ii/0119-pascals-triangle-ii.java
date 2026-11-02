class Solution {
    public List<Integer> getRow(int row) {
        ArrayList<Integer> list=new ArrayList<>();
       int arr[][]=new int[row+1][];

        for(int i=0;i<=row;i++){
arr[i]=new int[i+1];
        for(int j=0;j<=i;j++){
        if(i==j){
arr[i][j]=1;
        }
        else if(j==0){
arr[i][j]=1;
        }
        else{
arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
        }

        }

        for(int j=0; j<=row; j++){
        list.add(arr[row][j]);
        }

                return list;

        
    }
}
