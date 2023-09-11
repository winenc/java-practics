package Author;

import Author.Author;

public class testAuthor{
    public static void start() {
        Author Pushkin = new Author("Александр","none",'m');
        System.out.printf(Pushkin.getName()+" "+Pushkin.getEmail()+" "+Pushkin.getGender());
        Pushkin.setEmail("apush@mail.com");
        System.out.println(Pushkin.toString());
    }

}
