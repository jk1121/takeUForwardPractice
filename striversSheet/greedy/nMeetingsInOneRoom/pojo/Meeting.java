package takeUForward.striversSheet.greedy.nMeetingsInOneRoom.pojo;

/**
 * created by JK
 * on 01/05/23
 **/

public class Meeting {
    int startTime;
    int endTime;
    int pos;

    public Meeting(int startTime, int endTime, int pos) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.pos = pos;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
