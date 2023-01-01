import java.sql.*;
import java.util.Scanner;
import java.util.Set;
class DataBaseClass
{
    private final Connection con;
    public DataBaseClass() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymenuprogram","root","admin1234");
    }

    public void databaseInsert(BookRecord br) throws Exception
    {
        PreparedStatement ps=con.prepareStatement("insert into bookrecords values(?,?,?,?)");

        ps.setString(1,br.getBookName());
        ps.setString(2,br.getAuthorName());
        ps.setInt(3,br.getPrice());
        ps.setString(4, br.getGenre());

        ps.executeUpdate();

        ps.close();
        con.close();
    }

    public void showAllRecords() throws Exception
    {
        int id;
        BookRecord br =new BookRecord();
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from bookrecords");
        while(rs.next())
        {
            id=rs.getInt(1);
            br.setBookName(rs.getString(2));
            br.setAuthor(rs.getString(3));
            br.setPrice(rs.getInt(4));
            br.setGenre(rs.getString(5));

            System.out.println(id+ " "+ br.getBookName()+ " "+ br.getAuthorName()+ " "+ br.getPrice() + " "+ br.getAuthorName());
        }
        rs.close();
        stm.close();
        con.close();

    }

    public void updateBookRecord(int i,BookRecord br) throws Exception
    {
        PreparedStatement ps=con.prepareStatement("update bookrecords set book_name =?,author =?,price =?,genre =? where bookId=?");

        ps.setString(1,br.getBookName());
        ps.setString(2,br.getAuthorName());
        ps.setInt(3,br.getPrice());
        ps.setString(4, br.getGenre());
        ps.setInt(5,i);

        ps.executeUpdate();
    }

    public void deletingRecords(int i) throws Exception
    {
        PreparedStatement ps=con.prepareStatement("delete from bookrecords where bookId=?");
        ps.setInt(1,i);
        ps.executeUpdate();
        ps.close();
        con.close();
    }


}
