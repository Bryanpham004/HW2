package Practice;

import java.util.ArrayList;
import java.util.Stack;

public class Practice {

   public int numConnectedComponents(ArrayList<ArrayList<Integer>> graph) {
       /* Returns the number of connected components in the provided graph.
       *
       * This is the same problem as described in the group activity in Lecture 2.
       *
       * The graph will be given as an adjacency list. The graph will also be undirected.
       *
       * Example: (draw the graph out visually to confirm)
       * Number on left is vertex number, numbers on right are edges to other vertices.
       *
       * 0: 2
       * 1: 2
       * 2: 0, 1, 3
       * 3: 2
       * 4: 5, 6, 7
       * 5: 4
       * 6: 4, 7
       * 7: 4, 6
       * 8:
       *
       * Answer: 3 connected components.
       *
       * */


       // YOUR CODE HERE


   }

   public int numIslands(char[][] grid) {
       /*
       * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
       * return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands
       * horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
       *
       * Example 1:
       *
       * Input: grid = [
       *   ["1","1","1","1","0"],
       *   ["1","1","0","1","0"],
       *   ["1","1","0","0","0"],
       *   ["0","0","0","0","0"]
       * ]
       * Output: 1
       *
       * Example 2:
       *
       * Input: grid = [
       *   ["1","1","0","0","0"],
       *   ["1","1","0","0","0"],
       *   ["0","0","1","0","0"],
       *   ["0","0","0","1","1"]
       * ]
       * Output: 3
       *
       * */

       // YOUR CODE HERE

       // HINT: Can use a similar technique as the solution for numConnectedComponents, with small modification.
       // You ARE allowed to modify the input 2D array grid....
   }

   public boolean isValid(String s) {
       /*
        Given a string s containing just the characters '(' and ')'
        determine if the input string is valid. An input string is valid if:
        Open brackets must be closed and Open brackets must be closed in the correct order.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()()()"
        Output: true

        Example 3:
        Input: s = ")("
        Output: false

        Example 4:
        Input: s = "())("
        Output: false

        Example 5:
        Input: s = "((())())"
        Output: true

        HINT: This one will be a little harder to think of a solution.
        You may be tempted to just count the number of open and close parenthesis, but example 4 shows that will not work.

        The solution for this will involve using a stack and involve pushing into the stack when encountering an open
        parenthesis and popping from the stack when encountering a close parenthesis.

        Without giving away the solution, here are some things to consider:

        If we encounter a close parenthesis and try to pop from an empty stack what does this mean?
        If we reach the end of the function and the stack is not empty, what does this mean?

        You will want to use the charAt function for strings to access single parenthesis. Use Google to look up this documentation.

        For extra thought, think about what the runtime this solution would be.

        */

       Stack<Character> stack = new Stack<>();


   }

}
