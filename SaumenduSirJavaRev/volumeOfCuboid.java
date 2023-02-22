

/*
 * . Write a program to design a class Volume and then find out the volume of 
a Cube, Cylinder and Sphere using constructor overloading.
 */

package SaumenduSirJavaRev;

public class volumeOfCuboid {
    

    private double result;

    public volumeOfCuboid(double length, double width, double height) {
        this.result = length * width * height; // volume of a cuboid
    }

    public volumeOfCuboid(double radius, double height) {
        this.result = Math.PI * radius * radius * height; // volume of a cylinder
    }

    public volumeOfCuboid(double radius) {
        this.result = (4.0/3.0) * Math.PI * radius * radius * radius; // volume of a sphere
    }

    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        double length = 2.0;
        double width = 3.0;
        double height = 4.0;
        double radius = 1.5;

        volumeOfCuboid cuboid = new volumeOfCuboid(length, width, height);
        System.out.println("Volume of cuboid with length " + length + ", width " + width + " and height " + height + " = " + cuboid.getResult());

        volumeOfCuboid cylinder = new volumeOfCuboid(radius, height);
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " = " + cylinder.getResult());

        volumeOfCuboid sphere = new volumeOfCuboid(radius);
        System.out.println("Volume of sphere with radius " + radius + " = " + sphere.getResult());
    }
}

