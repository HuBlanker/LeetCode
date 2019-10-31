// 标题:
//      删除链表的倒数第N个节点

// 描述:
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针

// 思路:

/**
 * Created by huyanshi on 191031.
 *
 * 使用快慢指针的思想, 要删除倒数第x个节点,
 *
 * 让快指针先走,x个节点, 之后快慢一起走.
 * 那么当快指针走到链表尾部的时候, 慢指针的next就是要删除的节点, 将它删除即可.
 *
 *
 */

// ===============思路end=============


package editor.cn;

// My Code Start

import util.ListNode;

public class LeetCode19 {
    public static void main(String[] args) {
        Solution solution = new LeetCode19().new Solution();
        ListNode[] a = new ListNode[10];
        a[0] = new ListNode(1);
//        a[1] = new ListNode(2);
//        a[2] = new ListNode(3);
//        a[3] = new ListNode(4);
//        a[4] = new ListNode(5);

        a[0].next = a[1];
//        a[1].next = a[2];
//        a[2].next = a[3];
//        a[3].next = a[4];

        ListNode x = solution.removeNthFromEnd(a[0], 1);
        System.out.println(x);
        pri(x);

    }

    private static  void pri(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;

        }
        System.out.println();
    }


// My Code End


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode root = new ListNode(0);
            root.next = head;
            ListNode slow = root;
            ListNode fast = root;
            int i = 0;
            while (i <= n) {
                fast = fast.next;
                i++;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
//            slow.val = slow.next.val;
//            slow.next = slow.next.next;
            slow.next = slow.next.next;
            return root.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
