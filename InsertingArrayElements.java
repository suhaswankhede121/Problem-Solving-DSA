class InsertingArrayElements{

   static int[] atStart(int []arr,int ele){
        int ans[]=new int[arr.length+1];
        ans[0]=ele;
        for(int i=0;i<arr.length;i++){
           ans[i+1]=arr[i];
        }
        return ans;
    }
  static int[] atMiddle(int []arr,int ele,int index){
        int ans[]=new int[arr.length+1];
          for(int i=0;i<index;i++){
            ans[i]=arr[i];
          }
          ans[index]=ele;
          for(int i=index+1;i<ans.length;i++){
            ans[i]=arr[i-1];
          }
       return ans;
    }

  static int [] atEnd(int []arr,int ele){
    int ans[]=new int[arr.length+1];
    for(int i=0;i<arr.length;i++){
        ans[i]=arr[i];
    }
    ans[arr.length]=ele;
    return ans;
  }
    static void print(int []arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
         }
    }



    public static void main(String[] args) {
        int []arr={1,2,3,4};
     //   int ans[]=atStart(arr, 5);
   //  int ans[]=atMiddle(arr, 5, 2);
       int ans[]=atEnd(arr, 6);
      print(ans);
    }
}