public class Triangle implements Shape
{
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        float semiPerimeter = (a + b + c)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public float getA()
    {
        return a;
    }

    public float getB()
    {
        return b;
    }

    public float getC()
    {
        return c;
    }

}
