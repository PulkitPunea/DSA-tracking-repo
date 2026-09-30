class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head simplifies list construction and avoids the trailing zero bug
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            // 1. Safely extract values using ternary operators (if not null, use val; else use 0)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // 2. Calculate the total sum incorporating the existing carry
            int sum = x + y + carry;
            carry = sum / 10;
            
            // 3. Create the new node and advance the result pointer
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            // 4. Safely advance the input pointers
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual head of the result, skipping the placeholder dummy node
        return dummyHead.next;
    }
}