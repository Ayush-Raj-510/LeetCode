class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        ArrayList<String> list = new ArrayList<>(map.keySet());
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            minHeap.offer(word);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}