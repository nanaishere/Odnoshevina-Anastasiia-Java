package Test1;

public class Main {
    public static void main(String[] args) {
        GetNumber getNumber = new GetNumber();
        System.out.print("Введите цифру: ");
        int value = getNumber.readInt();
        Compare compareNumber = new Compare();
        String srt = compareNumber.compareNumber(value);
        System.out.print(srt);

    }
}

