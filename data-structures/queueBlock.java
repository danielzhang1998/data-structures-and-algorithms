import java.util.*;

/*  This is the block (array based) implementation
    of a queue data structure.
    This is my solution as practice for CITS200
    Data Structures & Alhrotithms at UWA.

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code\data-structures  (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac queueBlock.java
      java queueBlock
*/

class queueBlock{
  public Object[] items; // holds general objects
  private int s; // size of queue
  private int count; // number of characters currently in the queue


  public queueBlock(int s) {
    this.s = s;
    this.count = 0;
    items = new Object[s];
  }

  public Object enqueue(Object o){
    if (count != s) {
      count++;
      // System.out.println(count);

      Object previous = items[0];
      items[0] = o;
      for (int i = 1; i < s; i ++){
        Object temp = items[i];
        items[i] = previous;
        previous = temp;
      }
      return "Added: " + o;
    }
    else{return "Queue Full";}
  }

  public Object dequeue(){
    if (!isEmpty()){
      count--;
      // System.out.println(count);
      Object removedObject = items[count];
      items[count] = null;
      return "Removed object: " + removedObject;
    }
    else{return "Queue Empty";}
  }

  boolean isEmpty(){
    return count == 0;
  }

public void printBlock(){
  for (Object element : this.items){
    System.out.print(element + ", ");
  }
  System.out.println();
}

  public static void main(String args[]){
    queueBlock qB = new queueBlock(3);
    System.out.println(qB.dequeue());
    System.out.println(qB.enqueue("dog"));
    qB.printBlock();
    System.out.println(qB.enqueue("cat"));
    qB.printBlock();
    System.out.println(qB.enqueue("fish"));
    qB.printBlock();
    System.out.println(qB.enqueue("full element 1"));
    System.out.println(qB.enqueue("full element 2"));
    System.out.println(qB.dequeue());
    System.out.println(qB.enqueue("brand new fish"));
    qB.printBlock();
    System.out.println(qB.enqueue("full element 3"));

  }

}
