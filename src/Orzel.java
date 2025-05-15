public class Orzel extends Ptak {
    private double rozpiętośćSkrzydeł;

    public Orzel(String nazwa, int wiek, double rozpietosc) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpietosc;
    }

    @Override
    public String wydajDzwiek() {
        return "Szzzz";
    }

    @Override
    public String poruszajSie() {
        return "Lata w niebie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry";
    }

    public void szybuj() {
        System.out.println("Orzeł szybujący w poszukiwaniu zdobyczy");
    }
}