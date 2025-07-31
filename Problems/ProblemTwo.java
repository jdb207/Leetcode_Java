package Problems;

import Utils.ListNode;

public class ProblemTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l = new ListNode(0);
        ListNode d = l;
        while(l1 != null || l2 != null || carry != 0) {
            int sumOne = (l1!= null) ? l1.val : 0;
            int sumTwo = (l2 != null) ? l2.val : 0;
            d.next = new ListNode((sumOne + sumTwo + carry) % 10);
            carry = (sumOne + sumTwo + carry) / 10;
            d = d.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return l.next;
    }




    public static void main(String[] args) {
        ProblemTwo problemTwo = new ProblemTwo();
        ListNode nodeOneFirst = new ListNode(9);
        ListNode nodeOneSecond = new ListNode(9, nodeOneFirst);
        ListNode nodeOneThird = new ListNode(9, nodeOneSecond);

        ListNode nodeTwoFirst = new ListNode(9);
        ListNode nodeTwoSecond = new ListNode(9, nodeTwoFirst);
        ListNode nodeTwoThird = new ListNode(9, nodeTwoSecond);
        ListNode nodeTwoFour =  new ListNode(9, nodeTwoThird);
        ListNode nodeTwoFive =  new ListNode(9, nodeTwoFour);
        ListNode nodeTwoSix =  new ListNode(9, nodeTwoFive);
        ListNode nodeTwoSeven =  new ListNode(9, nodeTwoSix);

        System.out.println(problemTwo.addTwoNumbers(nodeOneThird, nodeTwoSeven));
    }
}
