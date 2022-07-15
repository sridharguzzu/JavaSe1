
/**
 *
 * Demonstration of Strings
 *
 * @author Sridhar Guzzu
 */
public class StringDatatype {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        string_declarations();
    }

    static void string_declarations() {
        String str_lit = "Welcome"; // Strig literal
        char ch[] = {'w', 'e', 'l', 'c', 'o', 'm', 'e'}; // character array
        String str_ch = new String(ch); // coverting character array ti string
        String str_new = new String("Welcome to Strings"); // Creating String using new keyword

        System.out.println(str_lit);
        System.out.println(str_ch);
        System.out.println(str_new);
    }

}
