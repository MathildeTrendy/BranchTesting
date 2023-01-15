import java.util.Random;

public class Julegave {

    private boolean isRectangular;
    private boolean isSoft;
    private boolean doesRattle;


    public Julegave() {
        Random random = new Random();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
        this.isSoft = random.nextBoolean();
    }

    public boolean couldBeLego() {
        return !isSoft && isRectangular && doesRattle; //!isSoft, fordi den skal være false, men de andre bare har deres navne.
    }


    public static void main(String[] args){
        Julegave storPakke = new Julegave();
        System.out.println("Kunne godt være lego: " + storPakke.couldBeLego());
    }
    }