public class Character {

    private String name;

    public Character() {
        // System.out.println("This is the default constructor!");
        name = " not set";
    }

    public Character(String userName) {
        // System.out.println("This is the overloaded constructor!");
        userName = name;
    }

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }
}