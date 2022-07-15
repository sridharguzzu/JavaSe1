package com.ntuc.demos.functionalInterfaces;

import java.util.function.Consumer;

/**
 *
 * @author Sridhar Guzzu
 */
public class ConsumerFunction2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        User david = new User("David", 999999999);
        greetUser.accept(david);

    }

    static Consumer<User> greetUser = user
            -> System.out.println("Hello " + user.userName
                    + " Thanks for registering with phone "
                    + user.phone);

}
