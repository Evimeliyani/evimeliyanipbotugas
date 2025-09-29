package collection;

import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> nilai = new HashMap<>();
        nilai.put("Evi", 90);
        nilai.put("Meliyani", 85);
        nilai.put("Java", 100);

        for (String key : nilai.keySet()) {
            System.out.println("Nama: " + key + ", Nilai: " + nilai.get(key));
        }
    }
}
