// 标题:
//      翻转二叉树

// 描述:
//翻转一棵二叉树。 
//
// 示例： 
//
// 输入： 
//
//      4
//   /   \
//  2     7
// / \   / \
//1   3 6   9 
//
// 输出： 
//
//      4
//   /   \
//  7     2
// / \   / \
//9   6 3   1 
//
// 备注: 
//这个问题是受到 Max Howell 的 原问题 启发的 ： 
//
// 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。 
// Related Topics 树 
// 👍 707 👎 0


// 思路:

/**
 * Created by huyanshi on 20201210
 *
 * 递归解决, 交换翻转后的左右子树.
 */

// ===============思路end=============


package editor.cn;

import util.LeetCodeUtil;
import util.ListNode;// My Code Start

public class LeetCode226 {
    public static void main(String[] args) {
        LeetCode226 lc = new LeetCode226();
        Solution solution = lc.new Solution();
        TreeNode t1 = lc.new TreeNode(1);
        TreeNode t2 = lc.new TreeNode(2);
        TreeNode t3 = lc.new TreeNode(3);
        t1.left = t2;
        t1.right = t3;

        TreeNode treeNode = solution.invertTree(t1);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);


    }


// My Code End

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return root;
            if (root.left == null && root.right == null) return root;
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
