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
        return "Pełznie cicho po ziemi";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla lub pustynia";
    }

    public void ukas() {
        System.out.println("Wąż kąsa swoją ofiarę!");
    }
}