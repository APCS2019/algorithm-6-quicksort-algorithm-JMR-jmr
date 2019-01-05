public class QuickSort{
  public static void quickSort(int[] ints, int begain, int end){
    int start = begain;
    int last = end;
    int key = ints[begain]；
      if(last-start<1){
        return;
      }
      while(last>start){
        if(last>start&&ints[last]>=key){
           end--;
        }
        else{
          if(ints[end]<=key){
            int temp = ints[end];
            ints[end]= ints[start];
             ints[start] = temp;
          }
        }
      if(end>start&&ints[start]>=key){
        start++;
      }
      else{
        if(ints[start]>=key){
          int temp = ints[start];
          ints[end] = ints[start];
          ints[start] = temp;
        }
      }
      
      
      
      }
      quickSort(ints, begain, start-1);
      quickSort(ints, end, last-1);
      
      
      }
  
}
