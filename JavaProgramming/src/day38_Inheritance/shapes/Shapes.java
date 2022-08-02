package day38_Inheritance.shapes;

public class Shapes {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("enter a shape name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shapes(String name) {
        setName(name);
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
