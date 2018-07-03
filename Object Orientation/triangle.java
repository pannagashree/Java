class GeometricObject {
    private String color = " white ";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;   
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Created on " + dateCreated + "\n color: " + color + " and filled ";                 
    }   
 }
class Triangle extends GeometricObject{
	private double side1,side2,side3;
	Triangle(){
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
	double getside1(){
		return side1;
	}	
	double getside2(){
		return side2;
	}
	double getside3(){
		return side3;
	}
	double getArea(){
		return (side1+side2+side3)/3;
	}
	double getPerimeter(){
		return (side1+side2+side3);
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;   
	}
}
class TestTraingle{
	public static void main(String[] args) {
		Triangle obj=new Triangle();
		System.out.println(obj.getside1());
		System.out.println(obj.getside2());
		System.out.println(obj.getside3());
		System.out.println(obj.getArea());
		System.out.println(obj.getPerimeter());
		System.out.println(obj.toString());
	}
}