// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class AnagraGroups {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> res = new HashMap<>();

//         for(String s : strs){
//             char[] sortedS = s.toCharArray();
//             Arrays.sort(sortedS);
//             String resultStr = new String(sortedS);
//             res.putIfAbsent(resultStr, new ArrayList<>());
//             res.get(resultStr).add(s);
//         }
//         System.out.println(res);
//         return new ArrayList<>(res.values());
//     }
//     public static void main(String[] args) {
//         AnagraGroups anagram = new AnagraGroups();
//         String[] str = {"act","pots","tops","cat","stop","hat"};
//         System.out.println(anagram.groupAnagrams(str));
    
//     }
// }

//java stream solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors; 

public class AnagraGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = Arrays.stream(strs)
            .collect(Collectors.groupingBy(s -> {
                char[] sortedS = s.toCharArray();
                Arrays.sort(sortedS);
                return new String(sortedS);
            }));
        return new ArrayList<>(res.values());
    }
    public static void main(String[] args) {
        AnagraGroups anagram = new AnagraGroups();
        String[] str = {"act","pots","tops","cat","stop","hat"};
        System.out.println(anagram.groupAnagrams(str));
    
    }
}
