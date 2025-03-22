class Box {
    double width, height, depth;

    // Copy Constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Parameterized Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxOb1 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box myclone = new Box(mybox1);  // Cloning the object

        double vol;
        vol = myclone.volume();  // Calling the volume method

        System.out.println("Volume of my clone is " + vol);
    }
}
		

