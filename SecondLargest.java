class SecondLargest{
    public static void main(String[] args) {
        int arr[]={12,90,5,43,14,78};
        int largest=arr[0];
        int second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest; //0 12  34  43
                largest=arr[i];//12 34  43 78
                //second=arr[i]; //12  34  43 78
    
            }else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}