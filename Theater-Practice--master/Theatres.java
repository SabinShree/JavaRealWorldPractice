package Collections.TheatreClassRealChallenge;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Theatres {
    private String theatreName;
    private List<Seats> seats = new ArrayList<>();

    static final Comparator<Theatres.Seats> seatRn = new Comparator<Seats>() {
        @Override
        public int compare(Seats seats1, Seats seats2) {
            if (seats1.getPrice() > seats2.getPrice()) {
                return 1;
            } else if (seats1.getPrice() == seats2.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }
    };


    public Theatres(String name, int row, int seatsPerRow) {
        this.theatreName = name;
        int lastRow = 'A' + (row - 1);
        for (char i = 'A'; i <= lastRow; i++) {
            for (int j = 1; j <= seatsPerRow; j++) {
                double price = 14.00;
                if ((i < 'C') && (j < 9 && j > 3)) {
                    price = 18.00;
                } else if ((i > 'F') || (j > 9) || (j < 3)) {
                    price = 12.00;
                }
                Seats seats = new Seats(i + String.format("%02d", j), price);
                this.seats.add(seats);
            }
        }

    }

    public boolean reserveSeats(String seatsNumber) {
        int low = 0;
        int high = this.seats.size() - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            Seats seatNo = this.seats.get(middle);
            //a b c d e
            int compareSeats = seatNo.getSeatNumber().compareToIgnoreCase(seatsNumber);
            if (compareSeats > 0) {
                high = middle - 1;
            } else if (compareSeats < 0) {
                low = middle + 1;
            } else {
                return seatNo.cancelSeat();
            }
        }
        return false;
    }

    public boolean cancelSeats(String seatNumber) {
        int low = 0;
        int high = this.seats.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            int compareMid = this.seats.get(mid).getSeatNumber().compareToIgnoreCase(seatNumber);
            if (compareMid > 0) {
                high = mid - 1;
            } else if (compareMid < 0) {
                low = high + 1;
            } else {
                this.seats.get(mid).cancelSeat();
            }
        }
        return false;
    }

    public Collection<Seats> getSeats() {
        return seats;
    }

    public class Seats implements Comparable<Seats> {
        private String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seats(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserveSeats() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seats is reserved");
                return true;
            } else {
                System.out.println("It is already booked. ");
                return false;
            }

        }

        public boolean cancelSeat() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("seat is cancelled.");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public int compareTo(Seats seats) {
            return this.getSeatNumber().compareToIgnoreCase(seats.getSeatNumber());
        }
    }
}
