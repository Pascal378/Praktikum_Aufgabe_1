package Praktikum_3;

public class VergleichTest {
    public static void main(String[] args) {
        int[] testArrayOne = {6, 5, 4, 3, 2, 2, 1}; // 2, 8, 12, 16, 55, 63
        int[] testArrayTwo = {1, 2, 2, 3, 4, 5, 6}; // 7, 42, 77, 87, 143, 543, 876
        
        Vergleich compare = new Vergleich();

        System.out.println(compare.isEqual(testArrayOne, testArrayTwo));
    }
}