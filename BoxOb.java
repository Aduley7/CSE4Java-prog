class BoxObjectDiameter {

    double length, width, height;

    // Constructor
    BoxObjectDiameter(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // equals method
    boolean equals(BoxObjectDiameter o) {
        return (o.length == this.length && o.width == this.width && o.height == this.height);
    }
}

public class BoxOb {
    public static void main(String[] args) {
       
        BoxObjectDiameter box1 = new BoxObjectDiameter(1, 2, 3);  
        BoxObjectDiameter box2 = new BoxObjectDiameter(3, 4, 6);
        BoxObjectDiameter box3 = new BoxObjectDiameter(1, 2, 3);  
       
        if (box3.equals(box1))
            System.out.println("Box3 is equal to Box1");
        else
            System.out.println("Box3 is not equal to Box1");

        if (box2.equals(box3))
            System.out.println("Box2 is equal to Box3");
        else
            System.out.println("Box2 is not equal to Box3");
    }
}
