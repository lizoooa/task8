public class Wez extends Gad {
    private boolean jadowity;

    public Wez(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {

        return "Ssssss";
    }

    @Override
    public String poruszajSie() {
        return "Pełznie";
    }

    @Override
    public String srodowiskoNaturalne() {

        return "Las, dżungli lub pustynia";
    }

    public void ukas() {

        System.out.println("Wąż atakuje swoją ofiarę");
    }
}