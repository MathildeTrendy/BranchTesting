public class DateAgeCalculator {
    // 1. Lav en klasse DateAgeCalculator der har to attributter: yourAge og dateAge
    private int dateAge;
    private int yourAge;


    //Laver konstruktør, som gør det muligt at teste et objekt med de rette attributter.
    public DateAgeCalculator(int dateAge, int yourAge) {
        this.dateAge = dateAge;
        this.yourAge = yourAge;
    }

    // 2. Tilføj en metode til at beregne den lavest acceptable dateAge ud fra formlen: lowest = yourAge / 2 + 7
    //vi laver en metode som returnerer formlen for skalaen.
    public int lowestAcceptableAge() {
        return yourAge / 2 + 7;
    }

    // 3. Tilføj en metode til at returnere hvorvidt date er for ung eller ej.
    //Bruger her "lowestAcceptableAge-metoden" for at få den rigtige beregning til "isTooYoung"-metoden.
    public boolean istooYoung() {
        return dateAge < lowestAcceptableAge() ;
    }

    public static void main(String[] args) {
        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(34,38);
        System.out.println(dateAgeCalculator.istooYoung());
    }

}