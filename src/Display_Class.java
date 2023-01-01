import java.sql.SQLOutput;
import java.util.Scanner;

public class Display_Class
{
    Scanner sc=new Scanner(System.in);
    static int count;
    static String resp;
    public void mainDisplayMethod() throws Exception
    {
        do
        {
            System.out.println(" /****** MENU DRIVEN PROGRAM ******/ ");
            System.out.println(" ");
            System.out.println("1. CREATE a Book Record ");
            System.out.println("2. UPDATE a Book Record");
            System.out.println("3. DELETE a Book Record");
            System.out.println("4. SHOW ALL RECORDS ");
            System.out.println("5. RETURN TO MAIN MENU ");
            System.out.println("6. EXIT ");
            System.out.println(" ");
            System.out.print("Enter your response here : -> ");
            count = sc.nextInt();
            sc.nextLine();
            if (count < 1 || count > 6)
            {
                System.out.println("Please Enter your response in the range of 1-6 only, Enter again : -> ");
                count = sc.nextInt();
            }
            switch (count)
            {
                case 1 ->
                {
                    Display_Class dc=new Display_Class(); //making object of display_class to call takingInput method

                    BookRecord br=dc.takingInput(); //storing the response of takingInput method into a reference variable of BookRecord Class

                    DataBaseClass dbc=new DataBaseClass();
                    dbc.databaseInsert(br);
                    //passing the book record object to db insert method, that will store it in database

                    System.out.println(br);
                    //printing the overloaded toString method of class Object */

                    System.out.println("Book Record Created Successfully"); //printing a success message

                }

                case 2 ->
                {
                    Display_Class dc=new Display_Class();

                    System.out.println(" For Updating a book record you have to enter book i'd ");
                    System.out.println("HINT : Don't know the Book I'd no worries just exit from this menu and than go to option No. 4");
                    System.out.println(" Do you have a Book I'd to Enter : YES/NO");
                    String res=sc.next();
                    if (res.equalsIgnoreCase("yes"))
                    {
                        System.out.print("Please enter the Book I'd :"); int id=sc.nextInt();
                        System.out.println("Okk... Now Please enter the details to be Updated ");
                        BookRecord br=dc.takingInput();

                        DataBaseClass dbc=new DataBaseClass();
                        dbc.updateBookRecord(id,br);

                        System.out.println(" Book Record UPDATED successfully");
                    }
                    else System.exit(0);
                }
                case 3 ->
                {
                    DataBaseClass dbc=new DataBaseClass();
                    System.out.print("Enter the Book ID to delete Record : "); int i=sc.nextInt();

                    dbc.deletingRecords(i);

                    System.out.println(" Record DELETED successfully");

                }
                case 4 ->
                {
                    System.out.println("Showing all book records");
                    DataBaseClass db=new DataBaseClass();
                    db.showAllRecords();
                }
                case 5 ->
                {
                    Display_Class db=new Display_Class();
                    db.mainDisplayMethod(); //returning to main page of user input program
                }
                case 6 -> System.exit(0);
            }

            System.out.println("DO YOU WANT TO RUN AGAIN : YES/NO");
            resp=sc.next();
        }while(resp.equalsIgnoreCase("yes"));
    }

    public BookRecord takingInput()
    {
        System.out.println("Please Enter the book details ");
        //Taking inputs for Book Details
        System.out.print("Book Name :");String bkNm=sc.nextLine();
        System.out.print("Author Name :");String athrNm=sc.nextLine();
        System.out.print("Genre : ");String gnr=sc.nextLine();
        System.out.print("Price : ");int pri=sc.nextInt();

        return new BookRecord(bkNm,athrNm,gnr,pri);

    }


}
