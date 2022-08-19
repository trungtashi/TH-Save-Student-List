import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Levi", 23);
        hashMap.put("Captain", 22);
        hashMap.put("Thanos", 25);
        hashMap.put("Thor", 20);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);
//          Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

//        Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> LinkedHashMap = new LinkedHashMap<>(16,0.75f,true);
                LinkedHashMap.put("Smith", 30);
                LinkedHashMap.put("Levi", 23);
                LinkedHashMap.put("Captain", 22);
                LinkedHashMap.put("Thanos", 25);
                LinkedHashMap.put("Thor", 20);

        System.out.println("The age for " + "Captain is " + LinkedHashMap.get("Captain"));

    }
}
