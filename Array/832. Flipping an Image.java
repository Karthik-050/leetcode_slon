*/
Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

Link:https://leetcode.com/problems/flipping-an-image/description/

Code:

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     int n = image.length;
     int res[][] = new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            res[i][n-1-j] =1- image[i][j];
        }
     }
     return res;
    }
}
