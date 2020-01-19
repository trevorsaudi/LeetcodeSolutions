class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);//incrementing the count for the occurence of the character
                                                //if c is not in the hashmap, assign 0 to the counter then add 1
                                                //if c is in the counter, return its value and add one 
            
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        //compare two items based on the count which is stored in the map
        
        maxHeap.addAll(map.keySet());
        StringBuilder result = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char current = maxHeap.remove();//gets the maximum character
            for (int i =0; i<map.get(current); i++){
                result.append(current);
            }
        }
        
        return result.toString();
    }
}
