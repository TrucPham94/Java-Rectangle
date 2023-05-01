public class Rectangle {

        private double length;
        private double width;

        // Constructor
        public Rectangle() {

        }

    public Rectangle(double length, double width) {
    }

    public void Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // setter

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    // Method Area

        public double getArea() {
            return (length*width);
        }

        public double getPerimeter() {
            return (length + width)*2;
        }

}
