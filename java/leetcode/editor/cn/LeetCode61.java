// 标题:
//      旋转链表

// 描述:
//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。 
//
// 示例 1: 
//
// 输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
//解释:
//向右旋转 1 步: 5->1->2->3->4->NULL
//向右旋转 2 步: 4->5->1->2->3->NULL
// 
//
// 示例 2: 
//
// 输入: 0->1->2->NULL, k = 4
//输出: 2->0->1->NULL
//解释:
//向右旋转 1 步: 2->0->1->NULL
//向右旋转 2 步: 1->2->0->NULL
//向右旋转 3 步: 0->1->2->NULL
//向右旋转 4 步: 2->0->1->NULL 
// Related Topics 链表 双指针

// 思路:

/**
 * Created by huyanshi on 191102.
 * <p>
 * 1. 暴力解法. 就和解决数组的旋转问题一样, 我们可以每次移动最后一个元素, 移动k次即可.
 * 但是很明显这样的时间复杂度太高, 我们这样做的话忽略了 链表这个数据结构的T特点.
 * <p>
 * 2.  直接找到新的尾节点和新的头结点.
 * 我们可以使用  k % n 来求出 新的尾部节点的位置. 他的前一个是新的头部节点. 然后将节点的指向更改成我们的样子即可.
 */

// ===============思路end=============


package editor.cn;

import util.*;

import javax.sound.midi.Soundbank;

// My Code Start

public class LeetCode61 {
    public static void main(String[] args) {
        Solution solution = new LeetCode61().new Solution();
        ListNode[] listNodes = LeetCodeUtil.newListNodeArr(5);
        ListNode listNode = solution.rotateRight(listNodes[0], 0);
        LeetCodeUtil.printListNode(listNode);

        ListNode listNode1 = solution.rotateRight(null, 0);
        LeetCodeUtil.printListNode(listNode1);

        ListNode listNode2 = solution.rotateRight(new ListNode(1), 1);
        LeetCodeUtil.printListNode(listNode2);
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
        public ListNode rotateRight2(ListNode head, int k) {
            for (int i = 0; i < k; i++) {
                head = ratateOne(head);
            }
            return head;
        }

        // 翻转一个,然后返回头结点
        public ListNode ratateOne(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode tmp = head;
            ListNode pre = null;
            while (head.next != null) {
                pre = head;
                head = head.next;
            }
            pre.next = null;
            head.next = tmp;
            return head;
        }

        //
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) return null;
            if (head.next == null) return head;
            if (k == 0) return head;
            int idx = 0;
            // 链表长度
            int n = 1;
            ListNode tmp = head;
            ListNode oldTail = head;
            while (oldTail.next != null) {
                oldTail = oldTail.next;
                n++;
            }
            oldTail.next = head;
            idx = n - k % n;
            ListNode newHead = null;
            ListNode newTail = head;

            int i = 0;
            while (i < idx - 1) {
                i++;
                newTail = newTail.next;
            }
            newHead = newTail.next;

            newTail.next = null;
            return newHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
