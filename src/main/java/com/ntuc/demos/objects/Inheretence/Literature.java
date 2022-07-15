package com.ntuc.demos.objects.Inheretence;
    
/**
 *
 * @author Sridhar Guzzu
 */
public class Literature {
    protected String title;
    protected String author;
    
    public Literature(String title, String author) {
        this.title = title;
        this.author=author;
    }
    
    public void Print(){
        System.out.println(title);
        System.out.println("\t is written by: "+ author);
    }
}
