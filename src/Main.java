// Ćwiczenie 1 - RAFAŁ BOGUSZ, HUANAN POLSKA, plik Main.java


// Zaczniemy od wczytania modułu Scanner pozwalającego na stworzenie obiektów input (typu Scanner)
// i wykorzystanie metody Scanner(System.in), dzięki czemu zaimplementowana zostanie obsługa wejścia

import java.util.Scanner;

// głowna klasa Main oraz wywołanie metody main(String[] args)
// z modyfikatorem dostępu public static ze zwracaniem wartości typu void

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     // utworzenie nowego obiektu input z typem Scanner

        System.out.print("Podaj imie: ");       // część programu implementująca
        String imie = input.next();             // zadanie pobrania danych osobowych od użytkownika
                                                // (imię, nazwisko, adres)
        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.next();

        System.out.print("Podaj adres: ");
        String adres = input.next();

        //przedstawienie wprowadzonych danych dot. użytkownika
        System.out.print("\nImię usera: " + imie + "\nNazwisko usera: " + nazwisko + "\nAdres usera: " + adres + "\n\n");


        // kolejna część kodu ma za zadanie utworzyć trzy obiekty typu Car,
        // każdy z nich ma charakteryzować się indywidualnymi cechami:
        // nazwa producenta, oznaczenie modelu, masa pojazdu <- wszystkie zagnieżdżone w kodzie

        Car Tesla = new Car("Tesla", "X",850);
        Car Mercedes = new Car("Daimler-Benz","124 C Klasse",1500);
        Car Fiat = new Car("Fiat","Seicento",550);

        // poniżej wywołanie metody print wyświetlającej w konsoli informacje o danym pojeździe
        // wraz z odwołaniem do metod getXXX pozwalających na dostęp do danych na temat konkretnej cechy pojazdu
        // "Forma" tej informacji deklarowana jest właśnie w metodzie Car.print();

        Tesla.print(Tesla.getManufacturer(), Tesla.getModel(), Tesla.getWeight());
        Mercedes.print(Mercedes.getManufacturer(), Mercedes.getModel(), Mercedes.getWeight());
        Fiat.print(Fiat.getManufacturer(), Fiat.getModel(), Fiat.getWeight());

        // mały dodatek implementujący check'a na metodę setXXX, umożliwiającą modyfikację cech pojazdów, dla sprawdzenia jak tym się w ogóle posługiwać
        System.out.print("\nNastąpiła drobna pommyłka... ");
        Fiat.setWeight(650);
        Fiat.setManufacturer("FSM");
        Fiat.print(Fiat.getManufacturer(), Fiat.getModel(), Fiat.getWeight());
        System.out.print("\n");

        Car CarTemp = new Car("aaa","bbb",111); // deklaracja obiektu CarTemp stanowiąca "bufor" na przyjęcie danych od usera

        CarTemp.createCarFromUserInput(CarTemp.manufacturer, CarTemp.model, CarTemp.weight);    // wywolanie metody Car.creatCarFromUserInput();
        CarTemp.print(CarTemp.getManufacturer(), CarTemp.getModel(), CarTemp.getWeight());      // wywolanie metody Car.print();

        System.out.print("\nPOZDRAWIAM!");

        input.close();                          //zamknięcie obsługi wejścia obiektem Scanner input.
    }
}
