package practice1.main;

public class Main {
    public static void main(String[] args) {
        String[] stringArr1 = {"Hello", "world"};
        String[] stringArr2 = {"Hello", "world", "!"};

        ArrayComparator<String> comparator = new ArrayComparator<>();
        System.out.println(comparator.compare(stringArr1, stringArr2));

        String[] stringArr3 = {"Hello", "world", "!"};
        String[] stringArr4 = {"Hello", "world"};
        System.out.println(comparator.compare(stringArr3, stringArr4));

        String[] stringArr5 = {"Hello", "world", "!"};
        String[] stringArr6 = {"Hello", "world", "!"};
        System.out.println(comparator.compare(stringArr5, stringArr6));
    }
}
