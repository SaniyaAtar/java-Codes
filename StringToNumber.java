public interface StringToNumber {
    public static String stringToNumber(int n){

        if(n==0){
            return "zero";
        }
        
        String res = "";
        int group = 0;

        String units[]={"one","two","three","four","five","six","seven","eigth","nine"};
        while(n>0){
            if (n % 1000 != 0) {
                
                int value = n % 1000;
                String temp = "";
                
                // Handle 3 digit number
                if (value >= 100) {
                    temp = units[value / 100] ;
                    value %= 100;
                }

                // Handle 2 digit number
                if (value >= 20) {
                    temp += units[value / 10] + " ";
                    value %= 10;
                }

                // Handle unit number
                if (value > 0) {
                    temp += units[value] + " ";
                }

                // Add the multiplier according to the group
                temp += units[group] + " ";
                
                // Add this group result to overall result
                res = temp + res;
            }
            n /= 1000;
            group++;
        }
        
        // Remove trailing space
        return res.trim();
        
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(stringToNumber(n));
    }

}
