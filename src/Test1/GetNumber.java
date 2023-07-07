package Test1;

import java.util.Scanner;

public class GetNumber {
    public Scanner getnumber;

    public GetNumber() {
        getnumber = new Scanner(System.in);
    }

    public int readInt() {
        return getnumber.nextInt();
    }
}
