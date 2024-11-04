public class BubbleSort{
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,1,7,9,8,2};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }        
        }
        printArray(arr);

        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }

        }
        System.out.print("\n SELECTION SORT  : " );
        printArray(arr);
    }
}