<<<<<<< HEAD
// /**
//  * ReverseStr
//  */
// public class ReverseStr {

//     public static void main(String[] args) {
//         String[] str={"jakiya","saniya","aliya","jibran"};
//         int start=0;
//        // int end = str[str.length];
//         while(start<end){
//             String temp=str[start];
//             str[start]=str[end];
//            // str[end]=str[temp];
//             start++;
//             end--;
//         };
//         while(start<end ){
//             System.out.println(str[start]);
//         };
//     }
// }
=======
/**
 * ReverseStr
 */
public class ReverseStr {

    public static void main(String[] args) {
        String[] str={"jakiya","saniya","aliya","jibran"};
        int start=0;
        int end=str[str.length];
        while(start<end){
            String temp=str[start];
            str[start]=str[end];
            str[end]=str[temp];
            start++;
            end--;
        };
        while(start<end ){
            System.out.println(str[start]);
        };
    }
}
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3