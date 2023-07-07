package Test1;

public class Compare {
    public static String compareNumber(int value) {

        String srt = "";
        if (value > 7) {
            System.out.print("Привет ");
        } else if (value < 7) {
            System.out.print(value);
        } else if (value == 7) {
            System.out.print("Уже близко ");
        }
        return srt;
    }
}
