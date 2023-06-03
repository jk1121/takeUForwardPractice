package takeUForward.striversSheet.greedy.nMeetingsInOneRoom;

import takeUForward.striversSheet.greedy.nMeetingsInOneRoom.pojo.Meeting;

import java.util.List;

/**
 * created by JK
 * on 01/05/23
 **/

public interface MeetingService {
    List<Meeting> findMaxMeetings(int[] start, int[] end);
}
