class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to act as the start of the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values of the current nodes, if available
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of the current digits and the carry
            int sum = x + y + carry;
            carry = sum / 10;  // Update carry for next digit
            sum = sum % 10;    // Get the current digit to store
            
            // Create a new node with the current digit and append it to the result list
            current.next = new ListNode(sum);
            current = current.next;
            
            // Move to the next nodes in the input lists, if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the next node of dummy head, which is the actual result
        return dummyHead.next;
    }
}
