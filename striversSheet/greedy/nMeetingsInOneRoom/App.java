package takeUForward.striversSheet.greedy.nMeetingsInOneRoom;

import takeUForward.striversSheet.greedy.nMeetingsInOneRoom.impl.MeetingServiceImpl;
import takeUForward.striversSheet.greedy.nMeetingsInOneRoom.pojo.Meeting;

import java.util.List;

/**
 * created by JK
 * on 01/05/23
 **/

public class App {
    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 5, 7, 9, 9};
        MeetingService ms = new MeetingServiceImpl();
        List<Meeting> meetings = ms.findMaxMeetings(start, end);
        System.out.println("Start Time   ::   End Time     ::   Position");
        meetings.forEach(m -> System.out.println(m.getStartTime() + "            ::        " + m.getEndTime() + "       ::       " + m.getPos()));

    }
}
