import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        reader.close();

        HashMap<Character, Integer> map = new HashMap<>();

        input.toUpperCase().chars().forEach((word) -> {
            char key = (char) word;

            map.put(key, map.getOrDefault(key, 0) + 1);
        });

        char mostChar = 0;
        int maxCount = 0;
        int sameCount = 0;

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue() > maxCount) {
                mostChar = entry.getKey();
                maxCount = entry.getValue();
                sameCount = 0;
            } else if (entry.getValue() == maxCount) {
                sameCount += 1;
            }
        }

        System.out.println(sameCount == 0 ? mostChar : "?");

    }
}