public class ReverseStringSimple {
    
        public static void main(String[] args) {
            String input = "HSBC";
            StringBuilder reversed = new StringBuilder(input).reverse();
            System.out.println("Reversed String: " + reversed);
        }
    
}
