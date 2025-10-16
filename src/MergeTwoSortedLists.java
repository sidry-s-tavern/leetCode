class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list11 = new ListNode(1);
        ListNode list12 = new ListNode(2);
        ListNode list13 = new ListNode(4);
        list11.next = list12;
        list12.next = list13;
//        list1 = [1,2,4], list2 = [1,3,4]
        ListNode list21 = new ListNode(1);
        ListNode list22 = new ListNode(3);
        ListNode list23 = new ListNode(4);
        list21.next = list22;
        list22.next = list23;
        printList(list11);
        System.out.println();
        printList(list21);

        return new ListNode();
    }

    public void foo(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode res = new ListNode();
        while ((curr2.next != null) && (curr1.next != null)) {
            if (curr1.val > curr2.val) {
                res.val = curr1.val;
                curr1 = curr1.next;
            } else {
                res.val = curr2.val;
                curr2 = curr2.next;
            }
            res.next = new ListNode();
        }

    }

    public void printList(ListNode list) {
        if (list.next != null) {
            printList(list.next);
        }
        System.out.print(list.val + " ");
    }
}
