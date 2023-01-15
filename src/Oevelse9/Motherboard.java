package Oevelse9;

// 1. Lav en klasse MotherBoard og en klasse SataDrive – giv MotherBoard mulighed for at ”tilkoble” fire SataDrives.

public class Motherboard {

    private SataDrive[] sataDrives = new SataDrive[4];   //laver array-attribut, så det er muligt at tilkoble 4 drives til den.

// 2. Tilføj en metode på MotherBoard der udskriver en liste over alle tilkoblede SataDrives.

    public void printAllConnectedDrives() {
        for (int i = 0; i < sataDrives.length; i++) { //
            if (sataDrives[i] != null) {
                System.out.println("Drive " + (i + 1) + ": " + sataDrives[i].getModel());
            }
        }
    }
/* 3. Tilføj en metode til at forbinde et SataDrive til MotherBoard – metoden skal selv finde en
      ledig plads, eller give besked om at boardet er fyldt. */

    public boolean connectDrive(SataDrive drive) {
        for (int i = 0; i < sataDrives.length; i++) {
            if (sataDrives[i] == null) {
                sataDrives[i] = drive;
                return true;
            }
        }
        System.out.println("The motherboard is full, no more drives can be added.");
        return false;
    }

    public static void main(String[] args) {
        Motherboard mb = new Motherboard(); //laver motherboard objekt for at kunne eksekvere "connectDrive" og "printAllConnectedDrives"-metoden
        SataDrive drive1 = new SataDrive("Seagate Barracuda"); //laver objekter fra konstruktør i SataDrive-klassen.
        SataDrive drive2 = new SataDrive("Samsung Evo");
        SataDrive drive3 = new SataDrive("Western Digital Black");
        SataDrive drive4 = new SataDrive("Toshiba X300");
        SataDrive drive5 = new SataDrive("Toshiba X301");

        mb.connectDrive(drive1); //connecter hver enkelte driver
        mb.connectDrive(drive2);
        mb.connectDrive(drive3);
        mb.connectDrive(drive4);
        mb.connectDrive(drive5); // this will print "The motherboard is full, no more drives can be added."
        mb.printAllConnectedDrives();


    }

}
