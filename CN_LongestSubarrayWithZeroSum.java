public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0, maxLen = 0;

    for (int i = 0; i < arr.size(); i++) {
        sum += arr.get(i);

        if (sum == 0) {
            maxLen = i + 1;
        } else if (map.containsKey(sum)) {
            maxLen = Math.max(maxLen, i - map.get(sum));
        } else {
            map.put(sum, i);
        }
    }

    return maxLen;
}
