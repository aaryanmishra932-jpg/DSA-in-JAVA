class Solution {
    public int diagonalSum(int[][] mat) {
    int sum=0;
    int xsum=0;
        for(int i=0;i<mat.length;i++){
              
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
                
            if(i+j==mat.length-1){
                if(i==j)continue;
                xsum=xsum+mat[i][j];
            }
            }
        }
        return sum+xsum;
    }
}