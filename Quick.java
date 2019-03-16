public class Quick{
  public static void quicksort(int[] data){
    quicksort(data, 0, data.length-1);
  }

  private static void quicksort(int[] data, int start, int end){
    if (start < end){
      int select = partition(data, start, end);
      for (int i=0; i<data.length;i++){
        System.out.print(data[i] + " ");
      }
      quicksort(data, start, select-1);
      quicksort(data, select+1, end);
    }
    for (int i=0; i<data.length;i++){
      System.out.print(data[i] + " ");
    }
  }

  public static int quickselect(int[] data, int k){
    int select = partition(data, 0, data.length - 1);
    System.out.println("k: "+ k);
    System.out.println("data: ");
    for (int i=0; i<data.length;i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("select: " + select);
    while (select != k){
      if (select == k){
        return data[select];
      }
      if (select < k){
        select = partition(data, select+1, data.length - 1);
        System.out.println(select);
      }if(select > k){
        select = partition(data, 0, select-1);
        System.out.println(select);
      }
    }
    return data[select];
  }

  public static int partition(int [] data, int start, int end){
    int choose = (int)(Math.random() * (end - start)) + start;
    int pivot = data[choose];
    data[choose] = data[0];
    data[0] = pivot;
    start++;
    System.out.println(pivot);
    int temp = 0;
    for (int i = start; i <= end; i = start){
      if (data[i] <= pivot){
        start++;
      }
      if (data[i] > pivot){
        temp = data[end];
        data[end] = data[i];
        data[i] = temp;
        end--;
      }
      for (int j=0; j<data.length;j++){
        System.out.print(data[j] + " ");
      }
      System.out.println("");
    }
    if (data[end] > pivot){
      end--;
    }
    temp = data[end];
    data[end] = pivot;
    data[0] = temp;
    for (int i=0; i<data.length;i++){
      System.out.print(data[i] + " ");
    }
    return end;
  }

}
