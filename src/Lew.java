public class Lew extends Ssak {
    private String kolorGrzywy;

    public Lew(String nazwa, int wiek, String kolorGrzywy) {
        super(nazwa, wiek);
        this.kolorGrzywy = kolorGrzywy;
    }

    @Override
    public String wydajDzwiek() {
        return "Rrrrr!";
    }

    @Override
    public String poruszajSie() {
        return "Biegnie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }

    public void poluj() {
        System.out.println("Lew polujący w grupie");
    }
}