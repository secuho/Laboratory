package arraylistobject;

import java.util.ArrayList;
import java.util.Objects;

public class ReservationManager {
    private ArrayList<Performance> performances;

    public ReservationManager() {
        performances = new ArrayList<>();
    }

    public void addPerformance(String performanceName, int totalSeats) {
        for (Performance p : performances) {
            if (Objects.equals(p.getPerformanceName(), performanceName)) {
                System.out.println("이미 존재하는 공연입니다.");
                return;
            }
        }

        Performance performance = new Performance(performanceName, totalSeats);
        performances.add(performance);
    }

    public void reserve(String performanceName) {
        boolean count = false;
        for (Performance p : performances) {
            if (Objects.equals(p.getPerformanceName(), performanceName)) {
                if (p.isSoldOut()) {
                    System.out.println("매진되었습니다.");
                    return;
                } else {
                    p.reserveSeat();
                }
                count = true;
            }
        }

        if (!count) {
            System.out.println("해당 공연이 없습니다.");
            return;
        }
    }

    public void cancel(String performanceName) {
        boolean count = false;
        for (Performance p : performances) {
            if (Objects.equals(p.getPerformanceName(), performanceName)) {
                if (p.getReservedSeats() == 0) {
                    System.out.println("취소할 예매 내역이 없습니다.");
                    return;
                } else {
                    p.cancelSeat();
                }
                count = true;
            }
        }

        if (!count) {
            System.out.println("해당 공연이 없습니다.");
            return;
        }
    }

    public void showAllPerformances() {
        for (Performance p : performances) {
            System.out.println("공연명: " + p.getPerformanceName() + ", 전체 좌석 수: " + p.getTotalSeats() + ", 예매 좌석 수: " + p.getReservedSeats());
        }
    }

    public void showSoldOutPerformances() {
        for (Performance p : performances) {
            if (p.isSoldOut()) {
                System.out.println("매진된 공연명: " + p.getPerformanceName() + ", 전체 좌석 수: " + p.getTotalSeats() + ", 예매 좌석 수: " + p.getReservedSeats());
            }
        }
    }


}
