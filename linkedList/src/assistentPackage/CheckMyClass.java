package assistentPackage;
import java.util.*;

public class CheckMyClass {
    public static void main(String[] args) {
        buildCollectionClass a = new buildCollectionClass(2);
        List<String> b = new LinkedList<>();
        b = a.getNewCollection();
        System.out.println(b.toString());
    }
}
