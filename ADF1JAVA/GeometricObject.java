
import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    /** Construct a default geometric object */
    protected GeometricObject() {
    dateCreated = new java.util.Date();
    }
    /** Construct a geometric object with the specified color
    * and filled value */
    protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    }
    /** Return color */
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public java.util.Date getDateCreated() { return dateCreated; }
    public String toString() {
   return "created on " + dateCreated + "\ncolor: " + color +
    " and filled: " + filled;
    }
    /** Abstract method getArea */
    public abstract double getArea();
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
   
    

}