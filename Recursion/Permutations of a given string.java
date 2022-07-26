
class Solution {
    public List<String> find_permutation(String S) {

         Character []arr=new Character[S.length()];
         HashMap<Character,Integer>lastocc=new HashMap<>();
         for(int i=0;i<S.length();i++)
         {
             lastocc.put(S.charAt(i),-1);
         }
        List<String>ans=new ArrayList<>();
         Permutations(0,S,ans,lastocc,arr);
         Collections.sort(ans);
        return ans;
    }
    public void Permutations(int ci,String s,List<String>ans,HashMap<Character,Integer>map,Character []arr)
    {
       if(ci==s.length())
       {
           String asf="";
          for(int i=0;i<arr.length;i++)
          {
              asf+=arr[i];
          }
          ans.add(asf);
          return ;
       }
       char ch=s.charAt(ci);
       int lo=map.get(ch);
       for(int i=lo+1;i<arr.length;i++)
       {
           if(arr[i]==null)
           {
               arr[i]=ch;
               map.put(ch,i);
               Permutations(ci+1,s,ans,map,arr);
               arr[i]=null;
               map.put(ch,lo);
           }
       }
    }
    
}
