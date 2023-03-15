int left=0,right=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int len=0;

        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
