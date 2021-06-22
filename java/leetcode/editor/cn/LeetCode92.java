// 标题:
//      反转链表 II

// 描述:
//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。 
//
// 说明: 
//1 ≤ m ≤ n ≤ 链表长度。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL 
// Related Topics 链表

// 思路:

/**
 * Created by huyanshi on 191104.
 * <p>
 * 感觉没有什么技巧, 个人的实现方式是, 一次扫描, 在两个断开处分别记录4个节点, 翻转中间范围内的链表之后再把他们链接起来.
 * 1. 一直走到m处, 记住断开处的前一个节点a.
 * 2. 翻转m-n之间的节点, m处的节点即为c, 然后记住最后一个节点b, 还有翻转后面的第一个节点d.
 * 3. 将 a->b,  c->d.
 */

// ===============思路end=============


package editor.cn;

import util.*;

// My Code Start

public class LeetCode92 {
    public static void main(String[] args) {
        Solution solution = new LeetCode92().new Solution();
        ListNode[] listNodes = LeetCodeUtil.newListNodeArr(5);
        ListNode listNode = solution.reverseBetween(listNodes[0], 2, 4);
        LeetCodeUtil.printListNode(listNode);
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
        public ListNode reverseBetween(ListNode head, int m, int n) {

            // Empty list
            if (head == null) {
                return null;
            }

            // Move the two pointers until they reach the proper starting point
            // in the list.
            ListNode cur = head, prev = null;
            while (m > 1) {
                prev = cur;
                cur = cur.next;
                m--;
                n--;
            }

            // The two pointers that will fix the final connections.
            ListNode con = prev, tail = cur;

            // Iteratively reverse the nodes until n becomes 0.
            ListNode third = null;
            while (n > 0) {
                third = cur.next;
                cur.next = prev;
                prev = cur;
                cur = third;
                n--;
            }

            // Adjust the final connections as explained in the algorithm
            if (con != null) {
                con.next = prev;
            } else {
                head = prev;
            }

            tail.next = cur;
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
