

public class Rectangle {
    private int x; // x coordinate of left-bottom corner
    private int y; // y coordinate of left-bottom corner
    private int width;
    private int height;
    // constructs a rectangle with given parameters
    public Rectangle(int x, int y, int width, int height) { //Overloaded Constructor
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    // constructs a rectangle which has left-bottom corner on the origin (0,0) with given width
    //and height
    public Rectangle(int width, int height) { //Overloaded Constructor
        this.width=width;
        this.height=height;
    }
    // returns left-bottom corner's x coordinate
    public int getX() {
        return x;
    }
    // returns left-bottom corner's y coordinate
    public int getY() {
        return y;
    }
    // returns width of the rectangle
    public int getWidth() {
        return width;
    }
    // returns height of the rectangle
    public int getHeight() {
        return height;
    }
    // changes the width, height and coordinates of the rectangle according to passed values
    public void reshape(int x, int y, int width, int height) {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    // changes the width and height of the rectangle according to passed values
    public void resize(int width, int height) {
        this.width=width;
        this.height=height;
    }
    // changes the coordinates of the rectangle according to passed values
    public void setLocation(int px, int py) {
        x=px;
        y=py;
    }

    // prints the coordinates of the left-bottom corner's coordinates (x,y)
    public void printLocation() {
        System.out.println(x+","+y);
    }
    // prints the coordinates of every corner
    public void printCoordinates() {

        System.out.println("Left-Bottom: "+"("+x+","+y+")");
        System.out.println("Left-Top: "+"("+x+","+(y+height)+")");
        System.out.println("Right-Top: "+"("+(x+width)+","+(y+height)+")");
        System.out.println("Right-Bottom: "+"("+(x+width)+","+y+")");
        System.out.println(" ");
    }
    // translates the rectangle and changes the coordinates according to passed values
    public void translate(int dx, int dy) {
        x+=dx;
        y+=dy;

    }
    // rotates the rectangle 90 degrees clockwise around its left-bottom corner
    public void rotateClockwise() {


        System.out.println("Left-Bottom: "+"("+x+","+(y-width)+")");
        System.out.println("Left-Top: "+"("+x+","+y+")");
        y=y+height;
        System.out.println("Right-Top: "+"("+height+","+(y-height)+")");
        System.out.println("Right-Bottom: "+"("+height+","+(y-(height+width))+")");
        System.out.println(" ");


    }
    // rotates the rectangle 90 degrees counter-clockwise around its left-bottom corner
    public void rotateCounterClockwise() {  //It rotates from the initial state

        int temp=x;
        x=-y;
        y=temp;
        System.out.println("Left-Top: "+"("+x+","+y+")");
        System.out.println("Left-Bottom: "+"("+x+","+(temp+width)+")");
        System.out.println("Right-Top: "+"("+y+","+(temp+width)+")");
        System.out.println("Right-Bottom: "+"("+y+","+y+")");
        System.out.println(" ");

    }
    // returns true if a given point is inside or on the rectangular area else returns false
    public boolean  contains(int x, int y) {
        boolean ret_val=false;
        if(this.x<=x && x<=(this.x+width) && y>=this.y&& y<(this.y+height))
        {
            System.out.println( "True, rectangle contains ("+x+","+y+")");
            ret_val=true;
            return ret_val;
        }
        System.out.println( "False, rectangle does not contain ("+x+","+y+")");
        return ret_val;
    }
    // contains your function calls
    public static void main(String args[]) {
        System.out.println("Rectangle1: ");
        Rectangle myrec=new Rectangle(0,0,5,6);
        myrec.printCoordinates();
        System.out.println("Rectangle 1 rotated clockwise:");
        myrec.rotateClockwise();
        //myrec.printCoordinates();
        System.out.println("Rectangle 1 rotated counter-clockwise:");
        myrec.rotateCounterClockwise();
        // myrec.printCoordinates();

        System.out.println("Rectangle 2: ");
        Rectangle myrec2=new Rectangle(3,5,2,2);
        myrec2.printCoordinates();
        System.out.println("Rectangle 2: translated 6 units to the right");
        myrec2.translate(6,0);
        myrec2.printCoordinates();
        myrec2.contains(10,6);

    }

}