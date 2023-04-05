public class TestInstructors
{
    public static void main(String[] args)
    {
        //create 4 objects for the instructor class
        Instructors instructor1 = new Instructors("Dr Samuel Sani", 1101, "Professor", "Physics", "Physical Science");
        Instructors instructor2 = new Instructors("Mr Fatai Adigun", 1102, "Senior Lecturer", "Civil Engineering", "Engineering");
        Instructors instructor3 = new Instructors("Mr Abdulrahmon Ali", 1103, "Professor", "Chemistry", "Physical Science");
        Instructors instructor4 = new Instructors("Mrs Lydia Abimbola", 1104, "Junior Lecturer", "Mathematics Education", "Education");

        //print the objects details
        System.out.println("The details of instructor1: \nName: " + instructor1.getName() + "\t Id: " + instructor1.getId() 
        + "\t Rank: " + instructor1.getRank() + "\t Department: " + instructor1.getDepartment() + "\t Faculty: " + instructor1.getFaculty() + "\n");

        System.out.println("The details of instructor2: \nName: " + instructor2.getName() + "\t Id: " + instructor2.getId() 
        + "\t Rank: " + instructor2.getRank() + "\t Department: " + instructor2.getDepartment() + "\t Faculty: " + instructor2.getFaculty() + "\n");

        System.out.println("The details of instructor3: \nName: " + instructor3.getName() + "\t Id: " + instructor3.getId() 
        + "\t Rank: " + instructor3.getRank() + "\t Department: " + instructor3.getDepartment() + "\t Faculty: " + instructor3.getFaculty() + "\n");

        System.out.println("The details of instructor4: \nName: " + instructor4.getName() + "\t Id: " + instructor4.getId() 
        + "\t Rank: " + instructor4.getRank() + "\t Department: " + instructor4.getDepartment() + "\t Faculty: " + instructor4.getFaculty());
    }   
}

class Instructors
{
    //attributes for instructors
    private String name;
    private int id;
    private String rank;
    private String department;
    private String faculty;

    //constructor for instructors
    public Instructors(String newName, int newId, String newRank, String newDepartment, String newFaculty)
    {
        name = newName;
        id = newId;
        rank = newRank;
        department = newDepartment;
        faculty = newFaculty;
    }

    //get methods for instructors
    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String getRank()
    {
        return rank;
    }
    
    public String getDepartment()
    {
        return department;
    }

    public String getFaculty()
    {
        return faculty;
    }
}