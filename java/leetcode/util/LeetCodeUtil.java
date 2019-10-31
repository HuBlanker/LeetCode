package util;

import editor.cn.LeetCode203;

/**
 * Created by pfliu on 2019/10/29.
 */
public class LeetCodeUtil {

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }
}
