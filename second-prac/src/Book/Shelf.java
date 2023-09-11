package Book;

import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> books;
    public Shelf()
    {
        books = new ArrayList<>();
    }
    private ArrayList<Book> bubbleSort(ArrayList<Book> books){
        ArrayList<Book> bookArr = new ArrayList<>(books);
        for (int i = 0; i < bookArr.size() - 1; i++) {
            for(int j = 0; j < bookArr.size() - i - 1; j++) {
                if(bookArr.get(j+1).year < bookArr.get(j).year) {
                    Book swap = bookArr.get(j);
                    bookArr.set(j,bookArr.get(j + 1));
                    bookArr.set(j+1,swap);
                }
            }
        }
        return bookArr;
    }

    public Book getOldest()
    {
        return sortBook().get(0);
    }
    public Book getNewest()
    {
        return sortBook().get(sortBook().size());
    }

    public ArrayList<Book> sortBook()
    {
        return  bubbleSort(this.books);
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void deleteBook(Book book)
    {
        books.remove(book);
    }
    public void deleteBook(int index)
    {
        books.remove(index);
    }

}
