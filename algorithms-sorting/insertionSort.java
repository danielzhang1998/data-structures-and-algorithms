import java.util.*;

/*  This is the insertion sort, sorting algorithm
    This is my solution as practice for CITS200
    Data Structures & Alhrotithms at UWA.
    Based off code from www.geeksforgeeks.org

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code>   (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac insertionSort.java
      java insertionSort
*/

class insertionSort {

  public static void sort(int[] arr){
      int length = arr.length;
      // System.out.println(length);

      for (int i = 0; i < length; i++){
        // System.out.println(i);
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key){
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
        // System.out.println(key);
      }

  }



  public static void main(String[] args) {
    int array[] = {1,2,6,7,1,3,2540,90,99999};  //  enter own array here

    System.out.println("Original array:");
    System.out.println(Arrays.toString(array));

    insertionSort one = new insertionSort();
    one.sort(array);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(array));

  }

}
