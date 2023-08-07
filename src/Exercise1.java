import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
  public static void main(String[] args) {
    Map<String, String> family = new HashMap<>();
    family.put("mom", "Carmen Martínez Castaño");
    family.put("dad", "Miguel Martínez Andrade");
    family.put("brother", "Andrés Martínez Martínez");
    family.put("sister", "Carolina Martínez Martínez");
    family.put("me", "Miguel Martínez Martínez");

    for (Map.Entry<String, String> member : family.entrySet()) {
        System.out.println("Relationship: " + member.getKey() + ", name: " + member.getValue());
    }
  }
}
