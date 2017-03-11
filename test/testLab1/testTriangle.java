package testLab1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testTriangle {
	@Before
    public void setUp() throws Exception {
        System.out.println("Before test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    @Test
    public void test1() {
        Triangle tri = new Triangle(2,2,2);
        assertEquals("equilateral",tri.triangleType());
        tri = new Triangle(4,6,6);
        assertEquals("isosceles",tri.triangleType());
        tri = new Triangle(5,5,3);
        assertEquals("isosceles",tri.triangleType());
        tri = new Triangle(3,4,5);
        assertEquals("scalene",tri.triangleType());
    }
    
    @Test
    public void test2(){
    	Triangle tri = new Triangle(1,4,1);
    	assertEquals("isosceles",tri.triangleType());
    }
}
