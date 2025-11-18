import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> indexMap = new HashMap<>();
        indexMap.put("code", 0);
        indexMap.put("date", 1);
        indexMap.put("maximum", 2);
        indexMap.put("remain", 3);

        int extIndex = indexMap.get(ext);       
        int sortIndex = indexMap.get(sort_by);  
        
        List<int[]> list = new ArrayList<>();
        for (int[] item : data) {
            if (item[extIndex] < val_ext) {
                list.add(item);
            }
        }

        Collections.sort(list, (a, b) -> a[sortIndex] - b[sortIndex]);

        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
