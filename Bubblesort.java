public class Bubblesort {

  public static void main(String args[]) {
    int a[] = { 40, 20, 30, 50, 90 };
    int n = a.length;
    System.out.print("Given List : ");

    for (int i = 0; i < n; i++) {
      System.out.print(" " + a[i]);
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {

        if (a[i] < a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;

        }

      }

    }
    System.out.println();
    System.out.print("After Soting in descending order the list : ");

    for (int i = 0; i < n; i++) {
      System.out.print(" " + a[i]);
    }

  }

}
