class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>st=new Stack<>();
       char[]arr=s.toCharArray();
       for(int i=0;i<arr.length;i++) {
        if(!st.isEmpty()&&st.peek()==arr[i]){
            st.pop();
        }else{
            st.push(arr[i]);
        }
       }
       String x="";
       while(!st.isEmpty()){
        x=st.pop()+x;
       }
       return x;
    }
}