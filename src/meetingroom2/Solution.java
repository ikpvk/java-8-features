package meetingroom2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (null == intervals || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> lastInterval = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        lastInterval.add(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            int[] current = intervals[i];
            int[] prev = lastInterval.remove();
            if(prev[1]<=current[0]) {
                prev[1] = current[1];
            } else {
                lastInterval.add(current);
            }
            lastInterval.add(prev);
        }

        return lastInterval.size();
    }
}
