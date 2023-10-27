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
        Place p1 = new Place(
                "Rivnens'ka",
                "14 / block 8",
                217,
                1,
                "МПУіК");
        City c1 = new City(
                "University",
                "28",
                19,
                2,
                "Chernivtsy",
                58012);
        Region r1 = new Region (
                "Theatrical",
                "2",
                45,
                7,
                "Chernivtsy",
                58002,
                "Bukovyna");
        Metropolis m1 = new Metropolis (
                "Kotsybynskogo",
                "2",
                6,
                9,
                "Chernivtsy",
                58002,
                "Bukovyna",
                "Ukraine",
                43000000);
        String placeInfo = p1.toString();
        System.out.println(placeInfo);
        String cityInfo = c1.toString();
        System.out.println(cityInfo);
        String regionInfo = r1.toString();
        System.out.println(regionInfo);
        String metropolisInfo = m1.toString();
        System.out.println(metropolisInfo);

        List<Address> addressList = new ArrayList<>();
        addressList.add(p1);
        addressList.add(c1);
        addressList.add(r1);
        addressList.add(m1);
        System.out.println(addressList);
    }
    public static void Task2() {
        Currency[] currencies = new Currency[]{
                new Dollar(100),
                new Euro(50)
        };

        for (Currency currency : currencies) {
            currency.display();
        }
    }
    public static void Task3() {
        Currency[] currencies = new Currency[]{
                new Dollar(100),
                new Euro(50)
        };

        for (Currency currency : currencies) {
            currency.display();
        }
    }
}

