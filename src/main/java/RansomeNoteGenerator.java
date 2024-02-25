import java.util.*;

public class RansomeNoteGenerator {

    public static void main(String[] args) {
//        List<List<String>> res = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

//        System.out.println(res);
        boolean ret = canConstruct("aa", "ab");
    }
        // Create a Map<String, List<Integer>>
//        Map<String, List<Integer>> myMap = new HashMap<>();
//
//        // Add some initial data
//        myMap.computeIfAbsent("A", k -> new ArrayList<>()).add(1);
//        myMap.computeIfAbsent("B", k -> new ArrayList<>()).add(2);
//
//        // Add an integer to the list associated with the key "A"
//        String keyToAddTo = "A";
//        int valueToAdd = 3;
//
//        myMap.computeIfAbsent(keyToAddTo, k -> new ArrayList<>()).add(valueToAdd);
//
//
//        // Print the updated map
//        System.out.println("Updated Map: " + myMap);
//    }
//        public static List<List<String>> groupAnagrams(String[] strs) {
//            Map<String, List<String>> map= new HashMap<>();
//            for (String word: strs) {
//                char[] ret= word.toCharArray();
//                Arrays.sort(ret);
//                String sorted = new String(ret);
////                map.cont
//                map.compute(sorted, (key, value) -> {
//                    if (value==null) {
//                        return new ArrayList<>(List.of(word));
//                    }
//                    value.add(word);
//                    return value;
//                });
//            }
//            return new ArrayList<>(map.values());
//        }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length()>magazine.length()) {
            return false;
        }
        List<Character> mag = magazine.chars().mapToObj(c->(char)c).toList();

        System.out.println(mag);
        for(char c: ransomNote.toCharArray()) {
            if(!mag.contains(c)) {
                return false;
            }
            mag.remove(c);
        }

        return true;

    }

}
