package com.ntuc.demos.functionalInterfaces;

import java.util.function.BiConsumer;

/**
 *
 * @author Sridhar Guzzu
 */
public class BiConsumerFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
             User david = new User("David", 999999999);
        greetUser.accept(david,true);
        greetUser.accept(david,false);

    }
        // BiConsumer accepts 2 arguments 
    static BiConsumer<User, Boolean> greetUser = (user, shownum)
            -> System.out.println("Hello " + user.userName
                    + " Thanks for registering with phone "
                    + (shownum ? user.phone: "*********"));
}
