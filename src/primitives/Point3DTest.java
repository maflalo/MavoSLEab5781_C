package primitives;

import jdk.jfr.StackTrace;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    Point3D p1= new Point3D(0.0d,0.5d,1.0d);
    Point3D p2= new Point3D(0.000000000001d,1.d,1.d);
   @Test
    void testEquals() {
        assertEquals(p1,p2);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        System.out.println("th first point is: " + p1);
        System.out.println("th seconed point is: " + p2);
    }

    @org.junit.jupiter.api.Test
    void distance() {
       assertEquals(20,p1.distance(p2));
    }
    @Test
    void distance(){
       Point3D p3 = new Point3D(0,0,2);
       double result = p3.distance(p2);
       assertEquales(1.5,result.distance(p2));
    }


    @org.junit.jupiter.api.Test
    void testEquals1() {
    }

    @org.junit.jupiter.api.Test
    void testToString1() {
    }
}