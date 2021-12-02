package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int max) {
        int count = 0;
        for (int h : heights) {
            if (h <= max) {
                count++;
            }
        }
        return count;
    }
}
