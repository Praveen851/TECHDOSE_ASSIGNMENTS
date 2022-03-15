#include <stdio.h>

void mergeSort(int arr[], int low, int mid, int high){
  int temp[high];
  int i = low, j = mid+1, k = 0;
  while(i <= mid  && j <= high){
    if(arr[i] > arr[j]){
      temp[k++] = arr[i++];
    }
    else{ 
      temp[k++] = arr[j++];   
    }
  }
  while(i <= mid){
      temp[k++] = arr[i++];
  }
  while(j <= high){
      temp[k++] = arr[j++];
  }
  
  k = 0;
  for(int i = low; i <= high; i++){
    arr[i] = temp[k++];
  }
}
void merge(int arr[], int low, int high){
  if(low < high){
    int mid = low+(high - low)/2;
    // printf("%d %d %d\n", low, high, mid);
    merge(arr, low, mid);
    // printf("%d %d %d\n", low, high, mid);
    merge(arr, mid+1, high);
    mergeSort(arr, low, mid, high);
  }
}
int main()
{
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i = 0; i < n; i++)scanf("%d", &arr[i]);
  int low = 0, high = n-1;
  merge(arr, low, high);
  for(int i = 0; i < n; i++)printf("%d ", arr[i]);

}
