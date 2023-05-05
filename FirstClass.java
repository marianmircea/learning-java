public class FirstClass {
    int x = 5; // attribute "x"

    public static void main(String[] args) {
        FirstClass first_object = new FirstClass();
        System.out.println(first_object.x);

        first_object.x = 10;
        System.out.println(first_object.x);
    }
}
