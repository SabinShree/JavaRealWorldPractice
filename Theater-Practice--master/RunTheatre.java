package Collections.TheatreClassRealChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunTheatre {
    public static void main(String[] args) {
        Theatres theatre = new Theatres("QFX hall", 10, 12);
        List<Theatres.Seats> seats = new ArrayList<>(theatre.getSeats());
        seats.add(theatre.new Seats("A12", 13));
        seats.add(theatre.new Seats("J12", 5));
        Collections.sort(seats, Theatres.seatRn);
      //  Collections.reverse(seats);
        printList(seats);


    }

    public static void printList(List<Theatres.Seats> list) {
        for (Theatres.Seats seats : list) {
            System.out.println(seats.getSeatNumber() + " :  " + seats.getPrice());
        }
    }
}
