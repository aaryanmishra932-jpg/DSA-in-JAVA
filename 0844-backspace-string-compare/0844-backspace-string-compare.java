class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>sta=new Stack<>();
        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           if(ch=='#'){
            if(!st.isEmpty()){
            st.pop();
            }
           } else{
            st.push(ch);
           }
        }
        String g="";
        while(!st.isEmpty()){
            g=st.pop()+g;
        }
          for(int i=0;i<t.length();i++){
           char ch =t.charAt(i);
           if(ch=='#'){
            if(!sta.isEmpty())
            sta.pop();
           } else{
            sta.push(ch);
           }
        }
         String m="";
        while(!sta.isEmpty()){
            m=sta.pop()+m;
        }
        if(g.equals(m)){
            return true;
        }else{
            return false;
        }
        
    }
}