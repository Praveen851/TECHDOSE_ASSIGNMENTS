import java.util.*;
public class Main {
    public static void main(String[] args) {
      int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
      int l = arr.length;
      for(int i = 1; i < l; i+=2){
        if(arr[i] > arr[i-1]){
          arr[i]^=arr[i-1];
          arr[i-1]^=arr[i];
          arr[i]^=arr[i-1];
        }
        if(i+1 < l && arr[i] > arr[i+1]){
          arr[i]^=arr[i+1];
          arr[i+1]^=arr[i];
          arr[i]^=arr[i+1];
        }
      }
      for(int a:arr)System.out.print(a+" ");
    }
}
