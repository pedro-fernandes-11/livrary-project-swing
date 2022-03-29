package javaapplication;

public class Book {
    private String title;
    private int year;
    private boolean isImported;
    
    public Book(String title, int year, boolean isImported){
        this.title = title;
        this.year = year;
        this.isImported = isImported;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getIsImported() {
        return isImported;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
    }
    
    public String toString(){
        return this.title+" "+this.year+" "+this.isImported;
    }
}
