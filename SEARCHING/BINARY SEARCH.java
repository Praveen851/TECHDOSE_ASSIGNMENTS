import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {1,4,7,9,15};
      int low = 0, high = 4, mid, search = 4;
      while (high>=low){
        mid = low+((high - low)/2);
        System.out.println(low + " " + mid + " " + high);
        if(arr[mid] == search){
          System.out.println(mid+" "+ arr[mid]);
          break;
        }
        else if(search < arr[mid]){
          high = mid-1;
        }
        else{
          low = mid +1;
        }
      }
    }
}
