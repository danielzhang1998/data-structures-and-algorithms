// import java.util.Stack;
import java.util.*;

/*  This is a non-recursive depth first search of a Binary Tree.
    This is my solution as practice for CITS200
    Data Structures & Algorithms at UWA.
    Based off code from www.geeksforgeeks.org

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code>   (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac nonRecursiveDfs.java
      java nonRecursiveDfs


    The idea being used:
        1. Create an empty stack - S
    		2. Initialize current node as root
    		3. Push the current node to S and set:
            current = currents left node untill current == null
    		4. While the current node is null and the stack is not empty
    			a. pop the top item from the stack
    			b. print the popped item, set current to popped items right
    			c. go to step 3
        5. If current is null and stack is empty then we are done
*/


class Node {  // nested node class (from www.geeksforgeeks.org)
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class nonRecursiveDfs {
  Node root;

  void dfs(){

    if (root == null) {
            return;
        }

    Stack<Node> stack = new Stack<Node>();
    Node curNode = root;  //  the current nodes

    ArrayList<Integer> inOrder = new ArrayList<>();

    while (curNode != null){ //  traverse left branch until bottom, add nodes to stack
      stack.push(curNode);
      curNode = curNode.left;
    }

    while (!stack.isEmpty()){
      Node popped = stack.pop();
      System.out.println(popped.data); // inOrder.add(popped);
      curNode = popped;

      if (curNode.right != null){
        curNode = curNode.right;
        while (curNode != null){ //  traverse left branch until bottom, add nodes to stack
          stack.push(curNode);
          curNode = curNode.left;
        }
      }
    }
  }

  public static void main(String[] args) {

    /* creating a binary tree and entering
     the nodes (www.geeksforgeeks.org) */
    nonRecursiveDfs tree = new nonRecursiveDfs();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.dfs();
  }

}
