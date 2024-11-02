import java.util.ArrayList;
import java.util.List;

class Collection{

    public static List ArrList(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1,2);
        list.add(6);
        list.remove(3);
        list.getFirst();
        System.err.println(list);
        return list;
    }
    public static void main(String[] args) {
        //ArrList();
       List<String> str=new List<String>();
        

       str.addAll(str);
       System.out.println(str);
       
    }
}