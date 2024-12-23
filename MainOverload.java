public class MainOverload {

    public static void main(String[] args) {
        System.out.println("Main method");
        
    }
    public static void main(int[] args){
        System.out.println("overloaded integer main method");
    }
    public static void main(double[] args) {
        System.out.println("doble main method");
    }
}