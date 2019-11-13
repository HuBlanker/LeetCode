// 标题:
//      两两交换链表中的节点

// 描述:
//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

// 思路:

/**
 * Created by huyanshi on 191101.
 * <p>
 * 1. 三指针.
 * 1. 给链表前面加一个手动加一个root.
 * 2. 三个指针, 分别指向: 待交换的两个的前一个,\ 待交换的前者, 待交换的后者 \ 每次遍历向后移动两个位置.
 * 3. 因此问题变成了每次 交换两个位置的节点, , 交换即可. 注意在交换过程中保存临时变量即可.
 * 4. 交换一次完成以后, fast和slow的位置是交换了的, 我们再把他交换回来.
 * 5. 时间复杂度O(N), 空间复杂度O(1) 因为只使用了三个指针加两个临时变量.
 */

// ===============思路end=============


package editor.cn;

// My Code Start

import util.LeetCodeUtil;
import util.ListNode;

public class LeetCode24 {
    public static void main(String[] args) {
        Solution solution = new LeetCode24().new Solution();
        ListNode[] listNodes = LeetCodeUtil.newListNodeArr(4);
        LeetCodeUtil.printListNode(listNodes[0]);

        ListNode listNode = solution.swapPairs(listNodes[0]);
        LeetCodeUtil.printListNode(listNode);

        ListNode[] listNodes1 = LeetCodeUtil.newListNodeArr(3);
        ListNode listNode1 = solution.swapPairs(listNodes1[0]);
        LeetCodeUtil.printListNode(listNode1);
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
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode root = new ListNode(0);
            ListNode ret = root;
            root.next = head;
            ListNode slow = root.next;
            ListNode fast = root.next.next;

            while (fast != null) {
                root.next = fast;
                ListNode next = fast.next;
                fast.next = slow;
                slow.next = next;

                ListNode tmp = fast;
                fast = slow;
                slow = tmp;
                if (fast.next != null && fast.next.next != null) {
                    fast = fast.next.next;
                    slow = slow.next.next;
                    root = root.next.next;
                } else {
                    break;
                }
            }
            return ret.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
