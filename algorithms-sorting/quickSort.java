import java.util.*;

/*  This is the quick sort, sorting algorithm
    This is my solution as practice for CITS200
    Data Structures & Alhrotithms at UWA.
    Based off code from www.geeksforgeeks.org
    and teaching.csse.uwa.edu.au/units/CITS2200.

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code>   (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac quickSort.java
      java quickSort
*/

class quickSort {

  public static void sort(int arr[], int bott, int top){
    int pi = 0; // partition index
    if (bott < top) {
      pi = partition(arr, bott, top);
      sort(arr, bott, pi - 1);
      sort(arr, pi + 1, top);
    }
  }


  static int partition(int arr[], int bott, int top){
    int pivot = arr[top]; // final element in array
    int i = bott - 1; // current element index

    for (int j = bott; j < top; j++){
      // if current element is smaller or equal to pivot
      if (arr[j] <= pivot){
        i++;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i+1];
    arr[i+1] = pivot;
    arr[top] = temp;
    return i+1;
  }



  public static void run(int arr[]){
    int bott = 0;
    int top = arr.length - 1;
    sort(arr, bott, top);
  }

  public static void main(String[] args) {
    int array[] = {1,2,7,6,1,3,2540,90,99999};  //  enter own array here

    System.out.println("Original array:");
    System.out.println(Arrays.toString(array));

    quickSort one = new quickSort();
    one.run(array);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(array));

  }

}
