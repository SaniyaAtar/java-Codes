import java.util.*;
public class CollectionTest {
    public static void main(String[] args) {
        listCollection();
        //queueCollection();
        //setCollection();
    }

    public static void listCollection(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1,2);
        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));
        System.out.println(list.add(5));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(3));
        System.out.println(list.set(1,3));
        System.out.println(list);
        System.out.println(list.size());

        Collections.addAll(list, 1,2,3,4,5,6,7);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.printf("Max value is %d  and Min Value is %d",max,min);
        System.err.println();
        System.out.println("Character sort   ");
        List<Character> ch=new ArrayList<>();
        Collections.addAll(ch, 'a','c','s','b','d');
        System.out.println(ch);
        Collections.sort(ch);
        System.out.println(ch);
        Collections.reverse(ch);
        System.out.println(ch);


        List<String> str=new ArrayList<>();
        Collections.addAll(str, "Saniya","Jakiya","Aliya","Jibran");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
        Collections.reverse(str);
        System.out.println(str);

    }
    public static void queueCollection(){
        Queue<String> q=new LinkedList<>();
        q.add("jakiya");
        q.add("saniya");
        q.add("aliya");
        q.add("jibran");
        System.out.println(q);
        q.offer("jibran");
        System.out.println(q);
        q.remove();
        System.out.println(q);

        System.out.println("poll methos" + q.poll());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

    }
    public static void setCollection(){
        Set<Character> set=new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        set.add('B');
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove('A'));
        System.out.println(set.remove('a'));
        System.out.println(set);
        System.out.println(set.contains('B'));
        System.out.println(set.isEmpty());


    }
}
