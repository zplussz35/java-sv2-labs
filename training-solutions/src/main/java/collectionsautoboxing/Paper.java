package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> classResults = new HashMap<>();


    public void putFurtherPaper(String className, int kilogramms) {
        if (!classResults.containsKey(className)) {
            classResults.put(className, kilogramms);
        } else {
            classResults.put(className,classResults.get(className)+kilogramms);
        }


    }

    public Map<String, Integer> getClassResults() {
        return classResults;
    }

    public String getWinnerClass() {
        int maxKg = 0;
        String maxName = "";
        for (Map.Entry<String, Integer> actual : classResults.entrySet()) {
            if (actual.getValue() > maxKg) {
                maxKg = actual.getValue();
                maxName = actual.getKey();
            }
        }
        return maxName;
    }

    public int getTotalWeight() {
        int result = 0;
        for (Map.Entry<String, Integer> actual : classResults.entrySet()) {
            result += actual.getValue();
        }
        return result;
    }
}
