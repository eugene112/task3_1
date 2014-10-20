/**
 * Created by student on 20.10.2014.
 */
public class task3_1 {
    public static void main(String[] args) {
        int [] a = new int[101];
        int i;
        for (i = 1; i <=100 ; i++) {
            a[i] = i;


            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("ABBA");
            } else if (i % 5 == 0) {
                System.out.println("A");
            } else if (i % 7 == 0) {
                System.out.println("B");
            } else {
                System.out.println(i);
            }
        }
    }
}
