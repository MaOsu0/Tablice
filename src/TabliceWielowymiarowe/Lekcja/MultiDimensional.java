package TabliceWielowymiarowe.Lekcja;

public class MultiDimensional {
    public static void main(String[] args) {

//        int [][] tab = new int[3][3];
//        tab [0][0] = 5;
//        tab [1][1] = 5;
//        tab [2][2] = 5;

//        int [][] tab = new int[3][];
//        tab[0] = new int[3];
//        tab[1] = new int[2];
//        tab[2] = new int[1];
        String[] firstName = {"Jan", "Kasia", "Basia"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};

        String [][] firstLast = {firstName,lastNames};
        System.out.println("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast [1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast [1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast [1][2]);

    }
}
