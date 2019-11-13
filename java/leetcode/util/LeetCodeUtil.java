package util;

import editor.cn.LeetCode203;

import javax.xml.soap.Node;

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

    public static ListNode[] newListNodeArr(int n) {
        ListNode[] a = new ListNode[n > 10 ?n : 10];

        for (int i = 0; i < n; i++) {
            a[i] = new ListNode(i + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            a[i].next = a[i + 1];
        }
        return a;
    }
}
