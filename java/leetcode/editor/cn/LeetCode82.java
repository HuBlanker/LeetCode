// 标题:
//      删除排序链表中的重复元素 II

// 描述:
//给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。 
//
// 示例 1: 
//
// 输入: 1->2->3->3->4->4->5
//输出: 1->2->5
// 
//
// 示例 2: 
//
// 输入: 1->1->1->2->3
//输出: 2->3 
// Related Topics 链表

// 思路:

/**
 * Created by huyanshi on 191102.
 * <p>
 * 按照题意遍历解决.
 * <p>
 * 每次对比当前节点之后的两个节点的值是否相等, 如果不相等, 迭代一下.
 * <p>
 * 如果相等, 那么就找到不等于这个值的第一个节点, 把他链接在根节点后面.
 */

// ===============思路end=============


package editor.cn;

import util.*;

import javax.sound.midi.Soundbank;

// My Code Start

public class LeetCode82 {
    public static void main(String[] args) {
        Solution solution = new LeetCode82().new Solution();
        ListNode[] listNodes = LeetCodeUtil.newListNodeArr(1);
        listNodes[1] = new ListNode(1);
        listNodes[0].next = listNodes[1];

        ListNode listNode = solution.deleteDuplicates(listNodes[0]);
        LeetCodeUtil.printListNode(listNode);


        ListNode[] a = new ListNode[10];
        a[0] = new ListNode(1);
        a[1] = new ListNode(2);
        a[2] = new ListNode(3);
        a[3] = new ListNode(3);
        a[4] = new ListNode(4);
        a[5] = new ListNode(4);
        a[6] = new ListNode(5);

        a[0].next = a[1];
        a[1].next = a[2];
        a[2].next = a[3];
        a[3].next = a[4];
        a[4].next = a[5];
        a[5].next = a[6];

        ListNode listNode1 = solution.deleteDuplicates(a[0]);
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
        public ListNode deleteDuplicates(ListNode head) {
            // bad case
            if (head == null || head.next == null) return head;
            // 手动添加一个根节点
            ListNode root = new ListNode(Integer.MAX_VALUE);
            ListNode ret = root;
            root.next = head;
            // 当前跟节点后面还有两个节点的时候
            while (root.next != null && root.next.next != null) {
                // 取两个节点的值进行对比
                int l1 = root.next.val;
                int l2 = root.next.next.val;
                if (l1 != l2) {
                    // 不相等继续
                    root = root.next;
                } else {
                    // 找到不相等的第一个节点,把他链接在root后面
                    ListNode tmp = root.next.next;
                    while (tmp.next != null && tmp.next.val == l2) {
                        tmp = tmp.next;
                    }
                    root.next = tmp.next;
                }
            }
            return ret.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
