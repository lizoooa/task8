public class Lew extends Ssak {
    private String kolorGrzywy;

    public Lew(String nazwa, int wiek, String kolorGrzywy) {
        super(nazwa, wiek);
        this.kolorGrzywy = kolorGrzywy;
    }

    @Override
    public String wydajDzwiek() {
        return "Roooar!";
    }

    @Override
    public String poruszajSie() {
        return "Biegnie po sawannie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }

    public void poluj() {
        System.out.println("Lew poluje w grupie");
    }
}