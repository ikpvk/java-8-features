package meetingroom2;

public class App {
    public static void main(String[] args) {
        int[][] intervals = {{8, 12}, {5, 10}, {10, 20},{15,20},{1,6}};
        Solution solution = new Solution();
        System.out.println("Min meeting rooms required : " + solution.minMeetingRooms(intervals));
    }
}
