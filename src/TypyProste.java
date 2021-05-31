public class TypyProste {

    public static void main(String[] args) {


        //liczby stałoprzecinkowe
        Byte firstNumver = 127; //1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; //4 bajty -2 147 283 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        //liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; //max 6-7 liczb po przecinku
        Double sixthNumber = 3.99999999999999D; //max ok. 15 cyfr po przecinku

        //wartości logiczne
        Boolean prawda = true;
        Boolean fałsz = false;

        //pojedynczy znak
        Character letter = 'Z';

        //ciągi znaków
        String hello = "Hello world";

        System.out.println(hello.charAt(1)); //wyświetlenie pierwszej literki z ciągu znaków hello

    }

}
