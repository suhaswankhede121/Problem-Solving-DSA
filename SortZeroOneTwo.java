class SortZeroOneTwo{

    static void sorting(int []arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){

            if(arr[low]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[high]==2){

                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        print(arr);

    }
    static void print(int []arr){
        for(int i=0;i<arr.length-1;i++){
           System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,2,0,0,2,1,1};
        sorting(arr);
    }
}