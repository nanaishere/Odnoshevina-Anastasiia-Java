package Test3;

public class ArrayMultipier {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 9, 12, 15, 18, 21};

        ArrayMultiplier arrayMultiplier = new ArrayMultiplier();
        int[] result = arrayMultiplier.getMultiplesOfThree(array);

        System.out.print("Элементы массива, которые кратны 3: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class ArrayMultiplier {
    public int[] getMultiplesOfThree(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 3 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i : array) {
            if (i % 3 == 0) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }
}

