package TabliceJednowymiarowe.Lekcja;

public class Company {
    public static void main(String[] args) {
        Empolyee[] employees = new Empolyee[20];
        employees[0] = new Empolyee("Jan", "Nowak", 3500);
        employees[1] = new Empolyee("MArta", "Zięba", 3700);
        employees[2] = new Empolyee("Karol", "Wojak", 4500);

        int employeeIndex = 2;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex - 1].getFirstName() + " " +
                    employees[employeeIndex - 1].getLastName() + " " +
                    employees[employeeIndex - 1].getSalary() + " zł");
        }
        System.out.println("rozmiar tablicy: " + employees.length);
    }
}
