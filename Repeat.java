/**
 * Repeat
 */
public class Repeat {

    public static void main(String[] args) {
        int[] a={10,20,30,10,30,20,10};
        int i=0,j=0;
        int temp=a[i],temp1=0;
        while(i<a.length){
            while(j<i){
                if(temp==a[i]){
                    temp1++;
                }
                j++;
            }
            
            i++;
        }
        System.out.println("number "+temp +" is repeated " +temp1);
    }
}