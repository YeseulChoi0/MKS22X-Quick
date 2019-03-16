public class Driver{
  public static void main(String[] commandLine){
    Quick selector = new Quick();
    int[] array = {17, 6, 5, 8, 7, 9, 15};
    //System.out.println(selector.partition(array, 0, 6));
    //System.out.println("quickselect: " + selector.quickselect(array, 3) + "should return 8");
    selector.quicksort(array);
    System.out.println("sorted");
    for (int i=0; i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    int[] array1 = {12, 3, 4, 5, 6, 1, 11};
    //System.out.println(selector.partition(array1, 0, 6));
    //System.out.println("quickselect: " + selector.quickselect(array1, 0) + "should return 1");
    // selector.quicksort(array1);
    // for (int i=0; i<array1.length;i++){
    //   System.out.print(array1[i] + " ");
    // }
  }
}
