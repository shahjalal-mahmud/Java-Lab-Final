class Student{
    private String name;
    private int id;
    private String address;
    private double cgpa;

    // Getter Methods
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public double getCgpa(){
        return cgpa;
    }

    // Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\nID: " + id + "\nAddress: " + address + "\nCGPA: " + cgpa;
    }
}

public class StudentTester{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("John");
        s2.setName("Mike");
        s3.setName("Carol");

        s1.setId(1539);
        s1.setCgpa(2.39);

        s2.setId(1540);
        s2.setCgpa(3.39);

        s3.setId(1541);
        s3.setCgpa(4.39);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
