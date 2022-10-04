package j04002_rectange;

public class Rectange {
    private int width, height;
    private String color;

    public Rectange() {
    }

    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int findArea() {
        return width * height;
    }

    public int findPerimeter() {
        return (width + height) * 2;
    }

    public String findColor() {
       color = color.replaceAll("\\s","");
       String s1 = color.substring(0,1).toUpperCase();
       String s2 = color.substring(1,color.length()).toLowerCase();
       color = s1 + s2;
       return color;
    }
}
