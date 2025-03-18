package org.example.Day002;


public class RealWorldScenario {

    public static ListNode addBalances(ListNode balanceA, ListNode balanceB){
        ListNode dummy = new ListNode(0); // dummy node to start result
        ListNode current = dummy;
        int carry = 0;

        while (balanceA != null|| balanceB != null || carry !=0){
            int sum = carry;

            if(balanceA != null){
                sum += balanceA.val;
                balanceA = balanceA.next;
            }
            if(balanceB != null){
                sum += balanceB.val;
                balanceB = balanceB.next;
            }

            carry = sum /10; // Extract carry;
            current.next = new ListNode(sum % 10);// Store only last digit
            current = current.next;
        }
        return  dummy.next; // Return the result list
    }

    public static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Wallet balance of User A: $342 -> [2 -> 4 -> 3]
        ListNode balanceA = new ListNode(2);
        balanceA.next = new ListNode(4);
        balanceA.next.next = new ListNode(3);

        // Wallet balance of User B: $465 -> [5 -> 6 -> 4]
        ListNode balanceB = new ListNode(5);
        balanceB.next = new ListNode(6);
        balanceB.next.next = new ListNode(4);

        System.out.println("Adding wallet balances ...");
        ListNode newBalance = addBalances(balanceA,balanceB);
        System.out.println("Updated balance:");
        printList(newBalance);// Output: 7-> 0 -> 8
    }
}
