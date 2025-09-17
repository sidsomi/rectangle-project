public class Rectangle {
    private double x, y, width, height;
    public Rectangle (double xIn, double yIn, double widthIn, double heightIn)
        {
        this.x = xIn;
        this.y=yIn;
        this.width=widthIn;
        this.height=heightIn;
        }
        public void calcArea()
        {
            System.out.println("Area:"+width*height);
        }
        public void calcPerimeter()
        {
            System.out.println("Perimeter:"+(height+width+height+width));
        }
        
    }