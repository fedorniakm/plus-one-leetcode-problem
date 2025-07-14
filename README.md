This repo contains <ins>my</ins> solutions for ~one~ two Leetcode problems:
- **_Easy_** - Plus One problem - <a href="https://leetcode.com/problems/plus-one">Plus One on Leetcode</a>
- **_Medium_** - Add Two Numbers problem - <a href="https://leetcode.com/problems/add-two-numbers">Add Two Numbers on Leetcode</a><br>

You can check the full code for solutions in the corresponding .java source files.<br>

## Plus One Problem

It is a simple solution, basically iterating backwards through the digits, incrementing the current digit or moving to the next one if overflown.<br>
If the first digit overflows, create a new, larger empty array and set the first number to 1.

```
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        int[] extended = new int[digits.length + 1];
        extended[0] = 1;
        return extended;
    }
}
```

## Add Two Numbers Problem

This solution is implemented using an Iterator of Integers. In this way, we can iterate through the resulting digits and collect them into ListNodes.<br>
Check the source code for details.


