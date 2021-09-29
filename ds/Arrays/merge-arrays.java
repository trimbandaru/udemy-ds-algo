import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    var marr = mergeSortedArrays(new int[]{0,3,4,31}, new int[]{3,4,6,30});
    System.out.println("merged array: "+Arrays.toString(marr));
  }

  public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
    int[] mergedArr = new int[arr1.length + arr2.length];
    // System.out.println(arr1.length +" "+arr2.length);
    if(arr1.length > 0 && arr2.length > 0){
      int i=0,j=0,m=0;
      while(i < arr1.length && j < arr2.length){
        System.out.println(i+"-"+j);
        System.out.println(arr1[i] == arr2[j]);
        if(arr1[i] == arr2[j]){
          mergedArr[m]=arr1[i];
          i++;j++;m++;
          continue;
        }
        if(arr1[i] < arr2[j]){
          mergedArr[m] = arr1[i];
          i++;
        }else{
          mergedArr[m] = arr2[j];
          j++;
        }
        m++;
      }
      
      for(int k=i; k < arr1.length; k++){
        mergedArr[m] = arr1[k];
        m++;
      }
      for(int l=j; l < arr2.length; l++){
        mergedArr[m] = arr2[l];
        m++;
      }

    }
    return mergedArr;
  }
}
