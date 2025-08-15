package OOPS;
/* Create a class box that uses a parameterized constructor to initialize the dimensions of a box.
    The dimensions of the box are width, height, depth. The class should have a method that can return
    the volume of the box. Create an object of the box class and test functionalities.
 */
public class VolumeofBox{
    int height;
    int length;
    int breadth;
    VolumeofBox(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    public double getVolume() {
        return length * breadth * height;
    }
    public static void main(String[] args) {
        VolumeofBox o = new VolumeofBox(10, 20, 30);
        System.out.println("Volume of the box: " + o.getVolume());
    }
}