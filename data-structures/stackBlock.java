import java.util.*;

/*  This is the block (array based) implementation
    of a stack data structure.
    This is my solution as practice for CITS200
    Data Structures & Alhrotithms at UWA.

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code\data-structures  (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac stackBlock.java
      java stackBlock
*/

class stackBlock{
  public Object[] items; // holds general objects
  private int s; // size of queue
  private int count; // number of characters currently in the queue


  public stackBlock(int s) {
    this.s = s;
    this.count = 0;
    items = new Object[s];
  }

  public Object enqueue(Object o){
    if (count != s) {
      items[count - 1] = o;
      count++;
      return o;
    }
    else{return "Sorry Queue Full: " + null;}
  }

  public Object dequeue(){
    if (!isEmpty()){
      Object removedObject = items[count - 1];
      items[count - 1] = null;
      return "Removed object: " + removedObject;
    }
    else{return "Sorry Queue Empty: " + null;}
  }

  boolean isEmpty(){
    return count == 0;
  }

  public static void main(String args[]){
    stackBlock qB = new stackBlock(3);
    System.out.println(qB.dequeue());
    System.out.print(Arrays.toString(qB));

    System.out.println(qB.enqueue("dog"));
    System.out.print(Arrays.toString(qB));

    System.out.println(qB.enqueue("cat"));
    System.out.print(Arrays.toString(qB));

    System.out.println(qB.enqueue("fish"));
    System.out.print(Arrays.toString(qB));

    System.out.println(qB.enqueue("full element 1"));
    System.out.println(qB.enqueue("full element 2"));
    System.out.println(qB.dequeue());
    System.out.println(qB.enqueue("brand new fish"));

  }

}
