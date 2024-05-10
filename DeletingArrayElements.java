public class DeletingArrayElements {


    static void atStart(int[]arr){
        //int ans[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
          arr[i]=arr[i+1];
        }
        // for(int i=0;i<arr.length-1;i++){
        //     System.out.print(" "+arr[i]);
        // }
        print(arr);
    }

    static void atMiddle(int []arr,int index){
        int n=arr.length-1;
      for(int i=index;i<n;i++){
        arr[i]=arr[i+1];
      }
      arr[n]=0;
      print(arr);
    }
    static void print(int []arr){
        for(int i=0;i<arr.length-1;i++){
           System.out.print(" "+arr[i]);
        }
   }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
       //atStart(arr);
        atMiddle(arr, 3);
        

    }
}
