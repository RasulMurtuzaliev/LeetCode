package Easy.Linked_List;

public class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode base = new ListNode();
        ListNode curr = base;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }

        return base.next;
    }

    public static void main(String[] args) {
        Merge_Two_Sorted_Lists_21 example = new Merge_Two_Sorted_Lists_21();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);

        ListNode result = example.mergeTwoLists(l1, l2);
        System.out.println(result);
    }
}
