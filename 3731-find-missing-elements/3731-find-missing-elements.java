class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> Ele = new ArrayList<>();
        Set <Integer> setEl = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            setEl.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for(int i=min; i<=max; i++){
            if(!setEl.contains(i)){
                Ele.add(i);
            }
        }
        return Ele;
    }
}