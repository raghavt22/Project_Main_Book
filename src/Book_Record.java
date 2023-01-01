class BookRecord
{
    private String bookName;
    private String authorName;
    private String genre;
    private int price;

    public BookRecord(String bookName, String authorName )
    {
        this.bookName=bookName;
        this.authorName=authorName;
    }
    public BookRecord(String bookName,String authorName, String genre,int price)
    {
        this.bookName=bookName;
        this.authorName=authorName;
        this.genre=genre;
        this.price=price;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthor(String author) {
        this.authorName = authorName;
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
                "/nBook Name : "+getBookName()+
                "/nAuthor Name : "+getAuthorName()+
                "/nGenre : "+getGenre()+
                "/nPrice : "+getPrice();
    }

}
