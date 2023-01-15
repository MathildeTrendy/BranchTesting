
// 1. Lav en klasse "Names" der har tre attributter: firstName, middleName og lastName

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;

/* 2. Tilføj en constructor der modtager et fullName og selv splitter det op i
de tre dele – men tager hensyn til at der måske ikke er et mellemnavn! */

    public Names(String fullName) { //Konstr. modtager nyt parameter.
        String[] dele = fullName.split(" "); //Array splitter fullname op, hver gang et space forekommer.
        this.firstName = dele[0]; //Firstname sættes til at være på 0. plads i array'et.
        if (dele.length == 2) { //Hvis listen har 2 værdier ->
            this.lastName = dele[1];//skal lastname sættes på listens 1. plads
        } else { //Hvis så der er et mellemnavn ->
            this.middleName = dele[1]; //sættes middlename på 1. plads
            this.lastName = dele[2]; // og lastname på 2. plads i listen.
        }
        }

//  3. Tilføj en toString der skriver det fulde navn ud, men tager hensyn til at der måske ikke er et mellemnavn.

    public String toString() {  //Laver toString for at udskrive navnene pænest muligt.
        if (middleName == null) { //Hvis ikke der er et mellemnavn, udskrives kun det 1. return statement.
            return "Firstname: " + firstName + "\nLastname: " + lastName + "\n";
        } else {
            return "Firstname: " + firstName + "\nMiddle name: " //hvis der er et mellemnavn, udskrives alle navne.
            + middleName + "\nLastname: " + lastName + "\n";
        }
    }

/* Tester koden:
   1. hvis du vil bygge videre, kan du evt. prøve at modtage input fra bruger,
      så inputtet automatisk inddeles i navnene.
   2. Prøv også at gøre det muligt kun at modtage firstname.*/

    public static void main(String[] args) {
        Names names = new Names("Hanne Vibeke Holst");
        Names names1 = new Names("Torben Dikeldauer");
        System.out.println(names);
        System.out.println(names1);

    }

}
