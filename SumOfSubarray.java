public class SumOfSubarray {
    static int sumOfContinueArray(int []arr){
       int cumax,maxsofar;
       cumax=maxsofar=arr[0];
       for(int i=0;i<arr.length;i++){
        cumax=Math.max(arr[i], cumax+arr[i]);
        maxsofar=Math.max(cumax, maxsofar);
       }
       return maxsofar;
    }
    public static void main(String[] args) {
        int []arr={-2,-2,1,3};
        System.out.println(sumOfContinueArray(arr));
    }
}
