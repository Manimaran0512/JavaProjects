package accessmodifier;

public class PubliAccess {
    public static void main( String[] args ) {
        // accessing the public class Animal1.java
        Animal animal1 = new Animal();

        // accessing the public variable
        animal1.legCount = 4;
        // accessing the public method
        animal1.display();
    }
}