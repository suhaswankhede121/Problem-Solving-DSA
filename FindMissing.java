public class FindMissing {
    //finding missing in 1 to n array 1 2 3 5 = missing is 4
    static int find(int []arr,int n){
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=5;
        System.out.println(find(arr, n));
    }
}
