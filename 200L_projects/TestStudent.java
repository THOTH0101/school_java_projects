public class TestStudent
{
    public static void main(String[] args)
    {
        //create two student objects
        Student student1 = new Student("Adkins Gregory");
        Student student2 = new Student(001, "Williams Harry");

        //get info
        System.out.println("student1 info\nID: " + student1.getID() + " Name: " + student1.getName()
        + " gpa: " + student1.getGPA());
        System.out.println("student2 info\nID: " + student2.getID() + " Name: " + student2.getName()
        + " gpa: " + student2.getGPA());

        student1.setGPA(3.0);
        student2.setGPA(4.5);

        //get info
        System.out.print("student1 info\nID: " + student1.getID() + " Name: " + student1.getName()
        + " gpa: " + student1.getGPA() + " evaluation: ");
        Student.evaluate(student1.getGPA());

        System.out.print("student2 info\nID: " + student2.getID() + " Name: " + student2.getName()
        + " gpa: " + student2.getGPA() + " evaluation: ");
        Student.evaluate(student2.getGPA());
    }
}

class Student
{
    //instance variable
    private int id;
    private String name;
    private double gpa;

    //overloading constructor
    public Student(int id, String name, double gpa)
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Student(int id, String name)
    {
        this(id, name, 0.0);
    }

    public Student(String name)
    {
        this(000, name, 0.0);
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setGPA(double newGPA)
    {
        gpa = newGPA;
    }

    public static void evaluate(double newGPA)
    {
        if(newGPA > 4.0)
            System.out.println("honor");
        else if(newGPA > 3.0)
            System.out.println("good standing");
        else
            System.out.println("under probation");
    }
}