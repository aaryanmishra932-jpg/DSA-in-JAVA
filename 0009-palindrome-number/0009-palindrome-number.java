class Solution {
    public boolean isPalindrome(int x) {
       
        int rev=0;
        int z=x;
    while(x!=0){
       
        int d=x%10;
        rev=rev*10+d;
        x=x/10;    
        
    }  
      if(rev==z && z>=0){
        return true;
      }else{
        return false;
      }
      

    }
}