/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var integers = integersIterator(l1, l2);

        ListNode currentResultNode = new ListNode();
        ListNode firstResultNode = currentResultNode;
        while (integers.hasNext()) {
            currentResultNode.val = integers.next();
            if (integers.hasNext()) {
                currentResultNode.next = new ListNode();
                currentResultNode = currentResultNode.next;
            }
        }

        return firstResultNode;
    }

    private Iterator<Integer> integersIterator(ListNode el1, ListNode el2) {
        return new Iterator<>() {
            ListNode l1 = el1;
            ListNode l2 = el2;
            int overhead = 0;

            @Override
            public boolean hasNext() {
                return Objects.nonNull(l1) || Objects.nonNull(l2) || overhead > 0;
            }

            @Override
            public Integer next() {
                int val1 = 0, val2 = 0, sum;
                if (Objects.nonNull(l1)) {
                    val1 = l1.val;
                    l1 = l1.next;
                }
                if (Objects.nonNull(l2)) {
                    val2 = l2.val;
                    l2 = l2.next;
                }
                sum = val1 + val2 + overhead;
                if (sum > 9) {
                    sum = sum - 10;
                    overhead = 1;
                } else
                    overhead = 0;
                return sum;
            }
        };
    }
}
