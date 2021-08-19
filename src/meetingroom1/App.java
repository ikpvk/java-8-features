package meetingroom1;

public class App {
    public static void main(String[] args) {
        int[][] intervals = {{20, 21}, {5, 10}, {10, 20}};
        Solution solution = new Solution();
        System.out.println("Will I be able to attend all meetings? : " + solution.canAttendMeetings(intervals));
    }
}
