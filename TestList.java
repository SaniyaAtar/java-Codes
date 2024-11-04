import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TestList
 */
public class TestList {

    public static void main(String[] args) {
       
        List<String> str=Arrays.asList("saniya","aliya","jakiya","sofiya","jibran","shahid","saniya");
        // str.add("saniya");
        // str.add("jakiya");
        // str.add("aliya");
        // str.add("sofiya");
        // str.add("jibran");
        // str.add("shahid");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
        Collections.reverse(str);
        System.out.println(str);
        int a=Collections.frequency(str,"saniya");
    System.out.println(a);
}
}