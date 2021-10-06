public class PracaD3 {
    public static void main(String[] args) {
        /*for (int i=1; i<=100; i++)
        {
            if (i%3==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------");*/

        int[] Tablica = new int []{1, 3, 5, 7, 0};
        for (int i=0; i<Tablica.length/2; i++)
        {
            int temp = Tablica[i];
            Tablica[i] = Tablica[((Tablica.length - 1) -i)];
            Tablica[((Tablica.length -1) - i)] = temp;
        }

        for (int i=0; i<Tablica.length; i++)
        {
            System.out.println(Tablica[i]);
        }

    }
}
