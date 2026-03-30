## Que - https://leetcode.com/problems/top-k-frequent-elements/description/

Here’s a clean and efficient **Java solution** for **Top K Frequent Elements**.

---

## 🔹 Approach 1: HashMap + Min Heap (PriorityQueue)

### 💡 Idea:

1. Count frequencies using a `HashMap`
2. Use a **min heap** of size `k` to keep top k frequent elements
3. If heap size exceeds `k`, remove the smallest frequency

### ✅ Time Complexity:

* `O(n log k)`

---

### ✅ Java Code:

```java
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min heap (based on frequency)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b)
        );

        // Step 3: Maintain heap of size k
        for (int num : freqMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Build result
        int[] result = new int[k];
        int i = 0;
        for (int num : minHeap) {
            result[i++] = num;
        }

        return result;
    }
}
```

---

## 🔹 Approach 2: Bucket Sort (Optimal)

### 💡 Idea:

* Max frequency ≤ n
* Create buckets where index = frequency
* Store numbers in corresponding bucket

### ✅ Time Complexity:

* `O(n)` (optimal)

---

### ✅ Java Code:

```java
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        // Step 3: Collect top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        // Convert to array
        return result.stream().mapToInt(i -> i).toArray();
    }
}
```

---

## 🔹 Which One Should You Use?

| Approach    | When to Use                  |
| ----------- | ---------------------------- |
| Min Heap    | When `k` is small            |
| Bucket Sort | When you want optimal `O(n)` |

---


