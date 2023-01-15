import java.time.LocalDate;

public class Dream {

    private LocalDate date;
    private double duration;
    private String type;

    public Dream(LocalDate date, double duration, String type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public boolean isPleasent() {
        if (type.equals("Nightmare")) {

        }return false;
    }

}

