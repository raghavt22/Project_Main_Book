import java.sql.SQLOutput;
import java.util.Scanner;

public class Display_Class
{
    Scanner sc=new Scanner(System.in);
    static int count;
    static String resp;
    public void mainDisplayMethod() throws Exception {
        do
        {
            System.out.println(" /****** MENU DRIVEN PROGRAM ******/ ");
            System.out.println(" ");
            System.out.println("1. CREATE a Book Record ");
            System.out.println("2. UPDATE a Book Record");
            System.out.println("3. DELETE a Book Record");
            System.out.println("4. SHOW ALL RECORDS ");
            System.out.println(" ");
            System.out.print("Enter your response here : -> ");
            count = sc.nextInt();
            sc.nextLine();
            if (count < 1 || count > 4)
            {
                System.out.println("Please Enter your response in the range of 1-4 only, Enter again : -> ");
                count = sc.nextInt();
            }
            switch (count)
            {
                case 1 ->
                {
                    //System.out.println("Creating a book record");
                    //DataBase_Class.dbInsert();

                    System.out.println("Please Enter the book details ");
                    //Taking inputs for Book Details
                    System.out.print("Book Name :");String bkNm=sc.nextLine();
                    System.out.print("Author Name :");String athrNm=sc.nextLine();
                    System.out.print("Genre : ");String gnr=sc.nextLine();
                    System.out.print("Price : ");int pri=sc.nextInt();

                    BookRecord br=new BookRecord(bkNm,athrNm,gnr,pri);
                    //creating a new object of Book_Record Class

                    DataBaseClass dbc=new DataBaseClass();
                    dbc.databaseInsert(br);
                    //passing the book record object to db insert method, that will store it in database

                    System.out.println(br);
                    //printing the overloaded toString method of class Object */

                    System.out.println("Book Record Created Successfully"); //printing a success message

                }

                case 2 -> System.out.println("Updating a book record");
                case 3 -> System.out.println("Deleting a book record");
                case 4 -> System.out.println("Showing all book records");
            }

            System.out.println("DO YOU WANT TO RUN AGAIN : YES/NO");
            resp=sc.next();
        }while(resp.equalsIgnoreCase("yes"));
    }
}
