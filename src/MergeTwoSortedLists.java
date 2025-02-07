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
        return new ListNode();
    }

    public int foo(ListNode list)
    {
        ListNode curr = list.next;
        while (!list.next.equals(null))
        {
            return list.val;
        }
        return list.val;
    }
}
