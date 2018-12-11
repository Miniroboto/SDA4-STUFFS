import java.awt.geom.Point2D;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        stringList.add("test");
        stringSet.add("test");

//        System.out.println(stringList);
//        System.out.println(stringSet);

        stringList.add("test");
        stringSet.add("test");

        System.out.println(stringList.get(0));
        Iterator <String> iter = stringSet.iterator();
        System.out.println(iter.next());

        Map<String, File> map = new HashMap<>();

        map.put("file1",new File("/random/path"));
        map.put("file2", new File("random/path2"));
        System.out.println(map);
        map.remove("file2");
        System.out.println(map);

    }
}
