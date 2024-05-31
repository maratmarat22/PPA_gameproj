package IO;

/**
* Данный класс содержит методы отображения армий для различных построений и меню.
*/

public class GameUI {
    //все на всех
    public static void displayBattlefield (String army1, String army2) {

        for (int i = 0; i < army1.length(); ++i) {
            System.out.print(army1);
            System.out.print("\t");
            System.out.print(army2);
        }
    }
    //по 3
    public static void displayBattlefield (String army11, String army12, String army13, String army21, String army22, String army23) {
        for (int i = 0; i < 2; ++i) {
            System.out.print(army13);
            System.out.print(army12);
            System.out.print(army11);
            System.out.print("\t");
            System.out.print(army21);
            System.out.print(army22);
            System.out.print(army23);
        }

    }


    public static void displayMenu() {

    }
}
