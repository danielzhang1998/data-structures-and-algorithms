import java.util.*;

/*  This is the merge sort, sorting algorithm
    This is my solution as practice for CITS200
    Data Structures & Alhrotithms at UWA.
    Based off code from www.geeksforgeeks.org

    To compile from windows command prompt:
      cd C:\Users\Jordi\Desktop\CODE GANG\CITS2200\exam-code>   (use your own)
      set path=C:\Program Files\Java\jdk1.8.0_161\bin
      javac MergeSort.java
      java MergeSort
*/

class mergeSort {

  /*  Method called for merging
      @parameter l: left
      @parameter m: middle
      @paremeter r: right
  */
  public static void merge(int[] arr, int l, int m, int r){
    int n1 =  m - l + 1;  //  length of first sub array
    int n2 = r - m; // length of second sub array

    int[] L = new int[n1];  //  creates temp array for L
    int[] R = new int[n2];  //  creates temp array for R

    for (int i = 0; i < n1; ++i){ // fills L
      L[i] = arr[l + i];
    }
    for (int j = 0; j < n2; ++j){ //  fills R
      R[j] = arr[m + 1 + j];
    }

    int i = 0; int j = 0;

    int k = l;
    while (i < n1 && j < n2){
      if (L[i] <= R[j]){
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while(i < n1){
      arr[k] = L[i];
      i++;
      k++;
    }
    while(j < n2){
      arr[k] = R[j];
      j++;
      k++;
    }
}


public static void run(int arr[], int l, int r){
  if (l < r){
    int m = (l+r)/2;  //  find middle point

    run(arr, l, m); //  sort first half
    run(arr, m+1, r); //  sort second half

    merge(arr, l, m, r);  //  merge the two halfs
  }
}


  public static void main(String[] args) {
    int array[] = {1,2,6,7,1,3,2540,90,99999};  //  enter own array here

    System.out.println("Original array:");
    System.out.println(Arrays.toString(array));

    mergeSort one = new mergeSort();
    one.run(array, 0, array.length - 1);

    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(array));

  }

}
