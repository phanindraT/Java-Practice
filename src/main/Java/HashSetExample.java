import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("turvo");
        hashset.add("lineage");
        hashset.add("lineage");
        System.out.println("HasSet:");
        for (String qa: hashset)
            System.out.println(qa);

        System.out.println("Using iterator on hashset:");
        Iterator<String> qa = hashset.iterator();
        while(qa.hasNext())
            System.out.println(qa.next());

        System.out.println("TreeSet:");
        // sorts based on the natural order. Seems turvo and Turvo are considered not identical.
        TreeSet<String> hashsetqa = new TreeSet<>();
        hashsetqa.add("turvo");
        hashsetqa.add("lineage");
        hashsetqa.add("lineage");
        hashsetqa.add("Turvo");

        for (String qaNew: hashsetqa)
            System.out.println(qaNew);

        System.out.println("Using iterator on treeset:");
        Iterator<String> newqa = hashsetqa.iterator();
        while(newqa.hasNext())
            System.out.println(newqa.next());

    }
}
