import java.util.Arrays;

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
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i], -1); // Fill the matrix with -1
        }
        
        int topRow = 0, bottomRow = m - 1, leftCol = 0, rightCol = n - 1;
        
        while (head != null && topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse from left to right along the top row
            for (int col = leftCol; col <= rightCol; col++) {
                if (head == null) break;
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;
            
            // Traverse from top to bottom along the right column
            for (int row = topRow; row <= bottomRow; row++) {
                if (head == null) break;
                matrix[row][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;
            
            // Traverse from right to left along the bottom row
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    if (head == null) break;
                    matrix[bottomRow][col] = head.val;
                    head = head.next;
                }
                bottomRow--;
            }
            
            // Traverse from bottom to top along the left column
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    if (head == null) break;
                    matrix[row][leftCol] = head.val;
                    head = head.next;
                }
                leftCol++;
            }
        }
        
        return matrix;
    }
}
