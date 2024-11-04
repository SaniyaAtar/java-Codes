import java.io.IOException;
import java.util.*;
class FileWriter{
    public static void main(String[] args) {
        String fileName="java-course.txt";
        try{
            FileWriter writer=new FileWriter(fileName);
            writer.write("I am Saniya Atar");
            writer.flush();
            System.out.println("File write successfullu");
        }catch(IOException e){
            System.out.printf("Exception occured",e.getMessage());
        }
    }
}