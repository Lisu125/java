public class PracaD4KlasyObiektyTablice {
    public static void main(String[] args) {
        Student pierwszy = new Student();
        pierwszy.imie = "Jan";
        pierwszy.nazwisko = "Nowak";
        pierwszy.email = "jannowak@poczta.pl";
        pierwszy.numerIndeksu = "1";
        pierwszy.nick = "nowakjan";

        Student drugi = new Student();
        drugi.imie = "Jan";
        drugi.nazwisko = "Kowalski";
        drugi.email = "jankowalski@poczta.pl";
        drugi.numerIndeksu = "2";
        drugi.nick = "kowalskijan";

        Student trzeci = new Student();
        trzeci.imie = "Michal";
        trzeci.nazwisko = "Kowalski";
        trzeci.email = "michalkowalski@poczta.pl";
        trzeci.numerIndeksu = "3";
        trzeci.nick = "kowalskimichal";

        Student[] Tablica = new Student[3];
        Tablica[0] = pierwszy;
        Tablica[1] = drugi;
        Tablica[2] = trzeci;


        for (int i=0; i<Tablica.length; i++)
        {
            Tablica[i].przedstawSie();
            Tablica[i].podajNrIndeksu();
            Tablica[i].podajEmail();
            Tablica[i].zalogujSie();
        }

    }
}
