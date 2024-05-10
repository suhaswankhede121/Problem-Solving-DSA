public class RightMax {
    static void rightGreater(int []arr){
    int max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>0;i--){
        if(arr[i]>max){
            max=arr[i];
            System.out.print(" "+max);
        }
    }
    }
    public static void main(String[] args) {
        int []arr={1,5,7,8,12,3};
        rightGreater(arr);
    }
}
