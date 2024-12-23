import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap{
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();
        map.put("India", "New delhi");
        map.put("Pakistan","Isalambad");
        map.put("China", "Beijing");
        map.put("USA","Washington");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        if(map.containsKey(name)){
            System.out.printf("name is %s  : %s ", name,map.get(name) );
            
           //map.get(map);
        }else{
            System.out.println("Name not found");
        }
    }


}
