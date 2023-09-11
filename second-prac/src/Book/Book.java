package Book;

//7. Создать класс, описывающий книгу (Book). В классе должны быть
//        описаны нужные свойства книги (автор, название, год написания и т. д.) и
//        методы для получения, изменения этих свойств. Протестировать работу класса
//        в классе BookTest, содержащим метод статический main(String[] args). Создать
//        класс книжная полка, в котором поля данных класса это массив объектов типа
//        книги (Book, и количество книг на книжной полке. Написать методы класса,
//        которые возвращают книги с самым поздним и самым ранним сроком издания.
//        Написать метод класса, позволяющий расставить книги на книжной полке в
//        порядке возрастания года выпуска. Используйте реализацию отношений
//        композиция классов.
public class Book {
    String author;

    String name;
    int year;

    public Book()
    {
        this.author = "N/A";
        this.name = "N/A";
        this.year = 0;
    }

    public Book(String author,String name,int year)
    {
        this.author = author;
        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

