/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean dfs(ListNode head, TreeNode root) {
        if (head == null) return true;  // If linked list is completely traversed, return true
        if (root == null) return false; // If tree node is null but linked list is not, return false
        if (head.val != root.val) return false; // If values don't match, return false

        // Recursively check the left and right subtrees
        return dfs(head.next, root.left) || dfs(head.next, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null)
            return false;
        // If values match, check for a path using dfs
        if (root.val == head.val && dfs(head, root)) {
            return true;
        }
        // Recursively search for the subpath in the left and right subtrees
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
