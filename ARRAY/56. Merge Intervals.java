class Solution {
    public static void sortbyColumn(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {            
          @Override  
          public int compare(final int[] entry1, 
                             final int[] entry2) {
            if (entry1[col] > entry2[col])
                return 1;
            else if(entry1[col] < entry2[col])
                return -1;
            else return 0;
          }
        });
    }
    public int[][] merge(int[][] intervals) {
        sortbyColumn(intervals, 0);
        
        List<int[]> list = new ArrayList();
        list.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] last = list.get(list.size() - 1);
            if(intervals[i][0] <= last[1]){
                last[1]=Math.max(last[1], intervals[i][1]);
                list.remove(list.size()-1);
                list.add(last);
            }
            else{
                list.add(intervals[i]);
            }            
        }
        return list.toArray(new int[list.size()][]);
    }
}
