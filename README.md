The repo contains a solution for the Plus One problem - <a href="leetcode.com/problems/plus-one">Plus One on Leetcode</a>

It is a simple solution, basically iterating backwards through the digits, incrementing the current digit or moving to the next one if overflown.<br>
If the first digit is also overflown, create a new empty array that is bigger than the previous and set the first number to be 1.  
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


