public class Rectangle implements Shape
{
    private float width;
    private float length;

    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area()
    {
        return (width * length);
    }

    @Override
    public double perimeter()
    {
        return 2*(length+width);
    }

    public float getWidth()
    {
        return width;
    }

    public float getLength()
    {
        return length;
    }
}
