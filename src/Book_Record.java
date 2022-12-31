public class Book_Record
{
    private String book_name;
    private String author;
    private String genre;
    private int price;

    public Book_Record(String book_Name, String author )
    {
        this.book_name=book_Name;
        this.author=author;
    }
    public Book_Record(String book_name,String author, String genre,int price)
    {
        this.book_name=book_name;
        this.author=author;
        this.genre=genre;
        this.price=price;
    }

    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString()
    {
        return "BOOK DETAILS"+
                "Book Name : "+getBook_name()+
                "Author Name : "+getAuthor()+
                "Genre : "+getGenre()+
                "Price : "+getPrice();
    }

}
