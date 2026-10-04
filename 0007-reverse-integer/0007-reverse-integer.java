class Solution {
    public int reverse(int x) {
        long rev=0;
        while (x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        System.out.println(rev);
       
       if(-1*Math.pow(2,31)>rev || Math.pow(2,31) < rev){
            return 0;
       }
          else return (int)rev;
    }
}