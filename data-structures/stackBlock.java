import java.util.*;

/*  This is the block (array based) implementation
    of a stack data structure.
    This is my solution as practice for CITS200
    Data Structures & Algorithms at UWA.

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code\data-structures  (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac stackBlock.java
      java stackBlock
*/

class stackBlock{
  public Object[] items; // holds general objects
  private int s; // size of stack
  private int count; // number of characters currently in the stack


  public stackBlock(int s) {
    this.s = s;
    this.count = 0;
    items = new Object[s];
  }

  public Object insert(Object o){
    if (count != s) {
      items[count] = o;
      count++;
      return "Added: " + o;
    }
    else{return "Stack full, coudn't add: " + o;}
  }

  public Object delete(){
    if (!isEmpty()){
      count--;
      Object removedObject = items[count];
      items[count] = null;
      return "Removed object: " + removedObject;
    }
    else{return "Stack Empty, cannot delete ";}
  }

  boolean isEmpty(){
    return count == 0;
  }


  public void printBlock(){
    System.out.print("[");
    for (Object element : this.items){
      System.out.print(element + ", ");
    }
    System.out.print("] \n");
  }

  public static void main(String args[]){

    System.out.println("\n\nSTACK:");
    stackBlock qB = new stackBlock(3);
    System.out.println(qB.delete());
    System.out.println(qB.insert("dog"));
    qB.printBlock();
    System.out.println(qB.insert("cat"));
    qB.printBlock();
    System.out.println(qB.insert("fish"));
    qB.printBlock();
    System.out.println(qB.insert("full element 1"));
    System.out.println(qB.insert("full element 2"));
    System.out.println(qB.delete());
    System.out.println(qB.insert("brand new fish"));
    qB.printBlock();
    System.out.println(qB.insert("full element 3"));

  }
}
