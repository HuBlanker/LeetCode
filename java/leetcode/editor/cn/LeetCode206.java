// 标题:
//      反转链表

// 描述:
//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表

// 思路:

/**
 * Created by huyanshi on
 */

// ===============思路end=============


package editor.cn;

// My Code Start

import util.ListNode;

public class LeetCode206 {
    public static void main(String[] args) {
        Solution solution = new LeetCode206().new Solution();
    }


// My Code End


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {

        public ListNode reverseList2(ListNode head) {
            if (head == null) return null;
            ListNode pre = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;

        }

        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode listNode = reverseList(head.next);
            ListNode tmp = listNode;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            head.next = null;
            tmp.next = head;
            return listNode;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
