class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, MaxLen = 0;
        boolean b = true;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                b = true;
                while(b){
                    if(s.charAt(l) == s.charAt(i)){
                        set.remove(s.charAt(l));
                        l++;
                        set.add(s.charAt(i));
                        b = false;
                        break;
                    }
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            else{
                set.add(s.charAt(i));
                if(MaxLen <= ((i - l) + 1)){
                    MaxLen = (i - l) + 1;
                }  
            }
        }
        return MaxLen;
    }
}