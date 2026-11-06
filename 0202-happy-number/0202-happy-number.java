class Solution {
    public boolean isHappy(int n) {
      while(n > 6) {
        int x = n;
        int sum = 0;
        while(x > 0) {
            int d = x % 10;
            sum = sum + (d * d);
            x = x / 10;
        }
        n = sum;
    }
if(n==1)
    return true;
else
 return false;
    }

}
      