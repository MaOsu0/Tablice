package TabliceJednowymiarowe.Ćwiczenie1;

public class ArraySum {
    public static void main(String[] args) {
        int [] datas1 = {1,2,3};
        int [] datas2 = {4,5,6};
        ArrayUtils utils = new ArrayUtils();

        int sum = utils.sumArray(datas1,datas2);

        System.out.println("Suma wynosi: ");
        System.out.println(sum);
    }
}
