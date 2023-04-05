public class TestAuthors
{
    public static void main(String[] args)
    {
        
    //create three objects
    Author author1 = new Author("Davis Johnson", "davisj@yahoo.com", 'M');
    Author author2 = new Author("Elisabeth Ogunniyi", "ogunniyi01@hotmail.com", 'F');
    Author author3 = new Author("Abdulraheem Green", "greenraheem@gmail.com", 'M');
    
    //test get methods
    System.out.println("Author1 info:\n Name: " + author1.getName() + "\tEmail: "
    + author1.getEmail() + "\tGender: " + author1.getGender());
    System.out.println("Author2 info:\n Name: " + author2.getName() + "\tEmail: " 
    + author2.getEmail() + "\tGender: " + author2.getGender());
    System.out.println("Author3 info:\n Name: " + author3.getName() + "\tEmail: " 
    + author3.getEmail() + "\tGender: " + author3.getGender());

    //test set method
    author3.setEmail("Abdulraheem01@gmail.com");
    System.out.println("Author3 info:\n Name: " + author3.getName() + "\tEmail: " 
    + author3.getEmail() + "\tGender: " + author3.getGender());
    }
}

class Author
{
    //class attributes(instance variable)
    private String name;
    private String email;
    private char gender;

    //constructor
    public Author(String NAME, String EMAIL, char GENDER)
    {
        name = NAME;
        email = EMAIL;
        gender = GENDER;
    }

    //get methods
    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }

    public void setEmail(String EMAIL)
    {
        email = EMAIL;
    }
}