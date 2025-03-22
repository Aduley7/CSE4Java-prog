
class Box {
    
    double length, width, height;

    
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    
    double calculateVolume() {
        return length * width * height;
    }
    double calculateSA() {
        return 2*( length * width + length * height + width * height);
    }

    
    void displayOwtalls() {
        System.out.println("Box Dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Box Surface Area:" + calculateSA());
        System.out.println("Volume: " + calculateVolume());
    }
}

public class BoxEample {
    public static void main(String[] args) {
       
        Box box1 = new Box(5.0, 3.0, 2.0);  
        Box box2 = new Box(7.0, 4.0, 3.0);  
       
        System.out.println("Box 1:");
        box1.displayOwtalls();  

        System.out.println("\nBox 2:");
        box2.displayOwtalls();  
    }
}
