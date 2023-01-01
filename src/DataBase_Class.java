import java.sql.*;
import java.util.Scanner;
import java.util.Set;
class DataBaseClass
{
    public DataBaseClass() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymenuprogram","root","admin1234");
    }
   public void dbInsert() throws Exception
   {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymenuprogram","root","admin1234");
       PreparedStatement ps=con.prepareStatement("insert into bookrecords values(?,?,?,?)");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Book Details");
       System.out.print(" Book Name : ");String bk_nm=sc.nextLine();
       System.out.print("Author Name : ");String ath_nm=sc.nextLine();
       System.out.print("Price : ");int pri=sc.nextInt();
       sc.nextLine();
       System.out.print("Genre : ");String gen=sc.nextLine();

       ps.setString(1,bk_nm);
       ps.setString(2,ath_nm);
       ps.setInt(3,pri);
       ps.setString(4,gen);

       ps.executeUpdate();

       ps.close();
       con.close();
   }


    public void databaseInsert(BookRecord br) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymenuprogram","root","admin1234");
        PreparedStatement ps=con.prepareStatement("insert into bookrecords values(?,?,?,?)");

        ps.setString(1,br.getBookName());
        ps.setString(2,br.getAuthorName());
        ps.setInt(3,br.getPrice());
        ps.setString(4, br.getGenre());

        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
