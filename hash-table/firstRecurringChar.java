import java.util.Map;
import java.util.HashMap;
class Main {
  public static void main(String[] args) {
     Character res = findFirstRecChar(new Character[]{'a','b','c','b'});
     System.out.println("repeating char: "+res);
  }

  private static Character findFirstRecChar(Character[] arr){
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    for(int i=0; i<arr.length;i++){
      Integer count = map.get(arr[i]);
      // System.out.println(arr[i] +"-"+count);
      if(count != null){
        // map.put(arr[i],++count);
        return arr[i];
      }else{
        map.put(arr[i],1);
      }
    }

    // for(int i=0; i<arr.length;i++){
    //   if(map.get(arr[i]) > 1){
    //     return arr[i];
    //   }
    // }
    return null;
  }
}
