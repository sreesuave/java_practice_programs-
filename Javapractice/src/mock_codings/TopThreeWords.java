package mock_codings;
import java.util.*;

public class TopThreeWords {
    public static List<String> getTopThreeWords(String input ) {
        
        String clean = input.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        
       
        String[] words = clean.split("\\s+");
        
        // Count word frequencies
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        
        // for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        //for grt 3 words
        List<String> top3 = new ArrayList<>();
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            top3.add(list.get(i).getKey());
        }
        
        return top3;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
        
        System.out.println(getTopThreeWords(input));
        sc.close();
    }
}
