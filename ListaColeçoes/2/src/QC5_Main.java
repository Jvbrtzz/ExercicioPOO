import java.util.*;

public class QC5_Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("João");
        al.add("Victor");
        al.add("Bortoluzzi");
        
        System.out.println(al);

        Set<String> hs = new HashSet<>(al);
        System.out.println(hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println(pq);

        TreeSet<String> ts = new TreeSet<>(pq);
        System.out.println(ts);
    }
}