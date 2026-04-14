package arraylistobject;

import java.util.ArrayList;

public class Performance {
    private String performanceName;
    private int totalSeats;
    private int reservedSeats;

    public Performance(String performanceName, int totalSeats) {
        this.performanceName = performanceName;
        this.totalSeats = totalSeats;
    }

    public String getPerformanceName() {    return performanceName;  }
    public int getTotalSeats() {    return totalSeats;   }
    public int getReservedSeats() { return reservedSeats;    }

    public void reserveSeat() {
        if (reservedSeats < totalSeats) {
            reservedSeats++;
        } else
            return;
    }

    public void cancelSeat() {
        if (reservedSeats > 0) {
            reservedSeats--;
        } else
            return;
    }

    public boolean isSoldOut() {
        if (reservedSeats == totalSeats)
            return true;
        else
            return false;
    }

}
