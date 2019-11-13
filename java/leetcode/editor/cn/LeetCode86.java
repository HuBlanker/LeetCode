// 标题:
//      分隔链表

// 描述:
//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。 
//
// 你应当保留两个分区中每个节点的初始相对位置。 
//
// 示例: 
//
// 输入: head = 1->4->3->2->5->2, x = 3
//输出: 1->2->2->4->3->5
// 
// Related Topics 链表 双指针

// 思路:

/**
 * Created by huyanshi on 191102.
 * 1. 比较粗暴的办法. 分别创建两个root. 然后遍历链表, 将 大于小于输入值的节点分别挂在两个root之后, 在最后将big串链接在small串后面. 时间复杂度 O(n), 空间复杂度O(1)
 */

// ===============思路end=============


package editor.cn;

import util.*;

// My Code Start

public class LeetCode86 {
    public static void main(String[] args) {
        Solution solution = new LeetCode86().new Solution();
        ListNode[] a = new ListNode[10];
        a[0] = new ListNode(1);
        a[1] = new ListNode(4);
        a[2] = new ListNode(3);
        a[3] = new ListNode(2);
        a[4] = new ListNode(5);
        a[5] = new ListNode(2);

        a[0].next = a[1];
        a[1].next = a[2];
        a[2].next = a[3];
        a[3].next = a[4];
        a[4].next = a[5];

        ListNode partition = solution.partition(a[0], 3);
        LeetCodeUtil.printListNode(partition);
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
        public ListNode partition(ListNode head, int x) {
            // 创建两个root
            ListNode root = new ListNode(Integer.MAX_VALUE);
            ListNode root2 = new ListNode(Integer.MAX_VALUE);
            ListNode small = root;
            ListNode big = root2;

            while (head != null) {
                // 大于小于的分别链接在各自的串后面
                if (head.val < x) {
                    small.next = head;
                    small = small.next;
                } else {
                    big.next = head;
                    big = big.next;
                }
                head = head.next;
            }
            // 合并
            small.next = root2.next;
            big.next = null;
            return root.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
