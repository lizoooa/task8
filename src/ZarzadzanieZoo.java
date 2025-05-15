public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 5, "Złota");
        Zwierze orzel = new Orzel("Bielik", 3, 2.5);
        Zwierze wez = new Wez("Kobra", 2, true);

        Zwierze[] zoo = {lew, orzel, wez};

        for (Zwierze z : zoo) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Poruszanie się: " + z.poruszajSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println();
        }

        // Przykład wywołania metody specyficznej
        ((Lew)lew).poluj();
        ((Orzel)orzel).szybuj();
        ((Wez)wez).ukas();
    }
}