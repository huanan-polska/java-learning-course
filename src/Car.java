// Ćwiczenie 1 - RAFAŁ BOGUSZ, HUANAN POLSKA, plik Car.java (czemu nie .class ?? )


import java.util.Scanner;

// klasa Car implementująca obsługę obiektów typu Car, ich atrybutów w postaci
// wagi - weight, nazwy producenta - manufacturer, ozaczenia modelu - model
public class Car {
    public int weight;                 //pole (atrybut/cecha) dot. masy pojazdu - w praktyce zmienna typu int
    public String manufacturer;        //pole (atrybut/cecha) dot. producenta pojazdu - w praktyce zmienna typu String
    public String model;               //j.w. - w praktyce zmienna String dot. konkretnego modelu pojazdu

    public Car(String manufacturer, String model, int weight) {         // konstruktor obiektu typu Car
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
    }

    public int getWeight() {                        // metoda typu getXXX(); zwracająca masę pojazdu (cechę/atrybut)
        return weight;
    }
    public int setWeight(int weight) {             // metoda typu setXXX(); umożliwiająca zmianę
        this.weight = weight;                       // masy pojazdu (zamiana cechy/atrybutu)
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
        }
    public String setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return manufacturer;
    }

    public String getModel() {
        return model;
        }
    public String setModel(String model) {
        this.model = model;
        return model;
    }

    // poniżej metoda print(arg(1),(arg(2),arg(3)) przygotowująca output w postaci
    // kompleksowej informacji na temat danego pojazdu - innymi słowy na temat konkretnego obiektu typu Car
    public void print(String manufacturer, String model, int weight) {
        System.out.println("Pojazd marki " + this.manufacturer + ", model: " + this.model + ", posiada masę: " + this.weight + " kg.");
    }

    //poniżej metoda creatCarFromUserInput(); pozwalająca na odbior danych od usera na temat nowego pojazdu (nowego obiektu Car)
    public void createCarFromUserInput(String manufacturer, String model, int weight){

        Scanner CarAttribute = new Scanner(System.in);

        System.out.print("Podaj nazwę producenta pojazdu: ");
        manufacturer = CarAttribute.next();
        setManufacturer(manufacturer);

        System.out.print("Podaj dokładne oznaczenie modelu: ");
        model = CarAttribute.next();
        setModel(model);

        System.out.print("Wpisz masę pojazdu (w kg, ale nie dodawaj oznaczenia jednostek): ");
        weight = CarAttribute.nextInt();
        setWeight(weight);

    }
}


