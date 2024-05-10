import java.util.ArrayList;
import java.util.List;

public class EquilibriumPoint {

    static List<Integer> EquiSum(int []arr){
     int totalSum=0;
     int leftSum=0; // using total-leftSum= rightSum
     int n=arr.length;
     List<Integer> list=new ArrayList<>();
     
     for(int i:arr){
        totalSum+=i;
     }
     for(int i=0;i<n;i++){
        totalSum-=arr[i];
        if(totalSum==leftSum){
            list.add(i);
        }
        leftSum+=arr[i];
      }
    return list;
    }
    //points where sum before and after is equal
    public static void main(String[] args) {
        int[]arr={1,5,4,0,6}; //2
        System.out.println(EquiSum(arr));
    }
}
