public class FirstClass {
    int x; // attribute "x"

    public FirstClass(){ // This is how the Constructor is created - must have the same name as the class
        x = 6;
    }

    public static void main(String[] args) {
        FirstClass first_object = new FirstClass();
        System.out.println(first_object.x);

        first_object.x = 10;
        System.out.println(first_object.x);
    }
}
