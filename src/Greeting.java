import java.util.Scanner;

public class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public void greet() {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        scanner.close();

        Greeting greeting = new Greeting(name);
        greeting.greet();
    }
}