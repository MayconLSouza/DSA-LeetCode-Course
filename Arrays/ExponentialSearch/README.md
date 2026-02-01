### Exponential Search

Given a sorted array of *n* elements, write a function to search for the index of a given element (target)

You must search for the range within which the target is included increasing *index* by powers of 2. If this range exists in array apply the Binary Search algorithm over it, else return -1.

**Example**

**Input:** arr = [1, 2, 3, 4, 5, 6, 7, ... 998, 999, 1000], target = 998 \
**Output:** 997

**Explanation**

```markdown
arr = [1, 2, 3, 4, 5, 6, 7, ... 998, 999, 1_000]

target = 998
index = 0
1. SEARCHING FOR THE RANGE
index = 1, 2, 4, 8, 16, 32, 64, ..., 512, ..., 1_024
after 10 iteration we have the index at 1_024 and outside of the array 
2. BINARY SEARCH
Now we can apply the binary search on the subarray from 512 and 1_000.
```
