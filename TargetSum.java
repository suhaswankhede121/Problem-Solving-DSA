import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TargetSum {
    // static boolean twoSum(int []arr){ ///1st way
    //     Set<Integer> set=new HashSet<>();
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(set.contains(sum-arr[i])){
    //           return true;
    //         }else{
    //             set.add(arr[i]);
    //         }
    //     }
    //     return false;
    // }

    static int[] twoSum(int []arr,int targetSum){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diffrence=targetSum-arr[i];
            if(map.containsKey(diffrence)){
                return new int[]{map.get(diffrence),i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int []result=twoSum(arr, 18);
        if(result!=null){
            System.out.print(result[0]+" "+result[1]);
        }else{
            System.out.println("Not Founds");
        }
    }
}
