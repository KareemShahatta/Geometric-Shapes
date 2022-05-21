public class Circle implements Shape
{

    private float radius;

    public Circle(float radius)
    {
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI  * radius;
    }

    public float getRadius()
    {
        return radius;
    }
}
