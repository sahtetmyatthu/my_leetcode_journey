package org.example.Day002;

/**
 *1. Create a dummy node to store the result and a pointer to track the current position.
 * 2. Initialize carry as 0.
 * 3. Loop while there are nodes in l1 or l2, or a carry remains:
 *    - Sum the values of l1, l2, and carry.
 *    - Compute the new carry (sum / 10).
 *    - Extract the current digit (sum % 10).
 *    - Create a new node with the digit and link it to the result list.
 *    - Move l1 and l2 to their next nodes if available.
 *
 * 4. Return the next node of the dummy (head of the resulting list).
 */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0); // Dummy Node
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int sum = carry;// Start with the previous carry

            if(l1 != null){
                System.out.println("Adding "+ l1.val + " from l1");
                sum += l1.val;
                l1 = l1.next; // Move to next node in l1
            }
            if(l2 != null){
                System.out.println("Adding "+ l2.val + " from l2");
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10; //Compute new carry
            int digit = sum % 10; // Compute current digit
            System.out.println("Sum "+ sum + ", Carry: "+ carry +" , Digit: "+ digit);

            current.next = new ListNode(digit); // Create new node with the digit
            current = current.next; // Move to the next position
        }
        return dummy.next;
    }

    public static  void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating first number : 342 -> [2-> 4 -> 3]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second number: 465 -> [5 -> 6-> 4]
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println("Adding two numbers:");
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println();
        System.out.println("Final Result: ");
        printList(result); // Output: 7 -> 0 -> 8 -> null

    }

}
