class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char a = t.charAt(i);
            smap.put(c,smap.getOrDefault(c,0)+1);
            tmap.put(a,tmap.getOrDefault(a,0)+1);
        }
        for(char c:smap.keySet()){
            if(smap.get(c)!=tmap.get(c)){
                return false;
            }
        }
        return true;
    }
}

// 52/53 test cases passed one is not passing
