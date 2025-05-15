public class Orzel extends Ptak {
    private double rozpiętośćSkrzydeł;

    public Orzel(String nazwa, int wiek, double rozpietosc) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpietosc;
    }

    @Override
    public String wydajDzwiek() {
        return "Kiiiiii!";
    }

    @Override
    public String poruszajSie() {
        return "Lata wysoko w powietrzu";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i klify";
    }

    public void szybuj() {
        System.out.println("Orzeł szybując wypatruje ofiary");
    }
}