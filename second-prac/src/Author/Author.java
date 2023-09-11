package Author;/*
Author.Author
        -name:String
        -email:String
        -gender:char
        ---------
        Author.Author(name:String,email:String,gender:char)
        +get name():String
        +get-email():String
        +set-email(email:String):void
        +get gender():char
        +to-string():String
*/

public class Author {
    private String name;
    private  String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  "\nName = " + name +
                "\nEmail = " + email +
                "\nGender = " + gender;
    }

}
