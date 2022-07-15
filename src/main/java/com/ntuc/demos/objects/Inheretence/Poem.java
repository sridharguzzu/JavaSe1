package com.ntuc.demos.objects.Inheretence;

/**
 *
 * @author Sridhar Guzzu
 */
public class Poem extends Literature {

    private String style;

    public Poem(String title, String author, String style) {
        super(title, author);
        this.style = style;
    }
    
    @Override public void Print(){
        System.out.println("Poem: "+ title);
        System.out.println("\tWritten By: " + author);
        System.out.println("\t In The style of: "+ style);
    }
}
