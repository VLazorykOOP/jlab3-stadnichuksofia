import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Java Lab 3 ");
        System.out.println("Enter the number of task: ");
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                Task1();
                break;
            }
            case 2: {
                Task2();
                break;
            }
            case 3:{
                Task3();
                break;
            }
            default: {
                System.out.println("No such task. Please choose from 1 to 3!");
            }
        }
    }
    public static void Task1(){

        Place[] places = new Place[3];

        places[0] = new Region("Львівська область", 2500000, "Іван Іванович");
        places[1] = new City("Львів", 720000, "Віктор Петрович");
        places[2] = new Metropolis("Київ", 3000000, "Максим Олександрович", "Фінансовий");

        for (Place place : places) {
            place.show();
        }
    }
    public static void Task2() {
        Currency[] currencies = new Currency[]{
                new Dollar(150),
                new Euro(25)
        };

        for (Currency currency : currencies) {
            currency.display();
        }
    }
    public static void Task3() {
        Currency[] currencies = new Currency[]{
                new Dollar(150),
                new Euro(90)
        };

        for (Currency currency : currencies) {
            currency.display();
        }
    }
}

