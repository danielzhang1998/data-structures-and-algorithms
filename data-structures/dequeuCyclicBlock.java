import java.util.*;

/*  This is the block (array based) implementation
    of a Cyclic Dequeue (doubly ended queue) data structure.
    This is my solution as practice for CITS200
    Data Structures & Algorithms at UWA.

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code\data-structures  (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac dequeueCyclicBlock.java
      java dequeueCyclicBlock
*/

class dequeueCyclicBlock{
  public Object[] items; // holds general objects
  private int s; // size of queue
  private int first; // index of position in block of first element
  private int count; // number of characters currently in the queue


  public dequeueCyclicBlock(int s) {
    this.s = s; // assign size to input s
    this.first = 0; // index of first element in queue
    this.count = 0; // count of elements currently in queue (unsure if begins at one or zer0)
    items = new Object[s]; // initializing object of size s
  }

  public Object enqueue(Object o){
    if (count != s) {
      items[0] = o;
      count++;
      return o;
    }
    else{System.out.print("Sorry Queue Full: ");}
    return null;
  }

  public Object dequeue(){
    if (isEmpty()){
      Object removedObject = items[count + 1];
      items[count + 1] = null;
      return removedObject;
    }
    else{System.out.print("Sorry Queue Empty: ");}
    return null;
  }

  boolean isEmpty(){
    return count == 0;
  }

  boolean hasNext(){
    return count > 0;
  }

  public static void main(String args[]){
    dequeueCyclicBlock qB = new dequeueCyclicBlock(3);
    System.out.println(qB.dequeue());
    System.out.println(qB.enqueue("dog"));
    System.out.println(qB.enqueue("cat"));
    System.out.println(qB.enqueue("fish"));
    System.out.println(qB.enqueue("full element 1"));
    System.out.println(qB.enqueue("full element 2"));
  }

}
