package takeUForward.striversSheet.greedy.nMeetingsInOneRoom.impl;

import takeUForward.striversSheet.greedy.nMeetingsInOneRoom.MeetingService;
import takeUForward.striversSheet.greedy.nMeetingsInOneRoom.pojo.Meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * created by JK
 * on 01/05/23
 **/

public class MeetingServiceImpl implements MeetingService {
    @Override
    public List<Meeting> findMaxMeetings(int[] start, int[] end) {

        int n = start.length;
        List<Meeting> ans = new ArrayList<>();
        List<Meeting> meetings = new ArrayList<>();
        for (int s = 0; s < n; s++) {
            meetings.add(new Meeting(start[s], end[s], s + 1));
        }
        sortMeetings(meetings);
        ans.add(meetings.get(0));
        int limit = meetings.get(0).getEndTime();
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).getStartTime() > limit) {
                ans.add(meetings.get(i));
                limit = meetings.get(i).getEndTime();
            }
        }

        return ans;
    }

    private void sortMeetings(List<Meeting> meetings) {
        meetings.sort((Comparator.comparingInt(Meeting::getEndTime)).thenComparingInt(Meeting::getPos));
    }
}
