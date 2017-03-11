package testLab1;

public class Triangle {
    private int a;
    private int b;
    private int c;
    public Triangle(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
    }
    public String triangleType() {
    	if(a + b < c || b + c < a || a + c < b)
    		return "notTriangle";
        if(a == b && b == c)
            return "equilateral";
        else if(a == b || b == c || c==a)
            return "isosceles";
        else {
            return "scalene";
        }
    }
}