package generics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericMethod {
    public static <T extends Collection<Integer>> void sampleMethod(T ele){
        Iterator<Integer> it = ele.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.add(56);
        list.add(89);
        list.add(75);
        list.add(36);
        sampleMethod(list);

        List<String> names = new ArrayList<>();
        names.add("aa");
        names.add("bb");
    }
}