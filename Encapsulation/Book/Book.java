package Book;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;
    static int uniqueBookCounter;
    Book(){}
    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        uniqueBookCounter++;
    }
    public void setbookName(String bookName){
        this.bookName = bookName;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
    public void setBookID(String bookId){
        this.bookId = bookId;
    }
    public void setBookType(String bookType){
        this.bookType = bookType;
    }
    public void setbookCopy(int bookCopy){
        this.bookCopy = bookCopy;
    }

    public String getBookId(){
        return this.bookId;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public String getBookType(){
        return this.bookType;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getBookCopy(){
        return this.bookCopy;
    }
    public void showDetails(){
        System.out.println("Book Name : "+this.bookName);
        System.out.println("Book Author : "+this.bookAuthor);
        System.out.println("Book ID : "+this.bookId);
        System.out.println("Book Type : "+this.bookType);
        System.out.println("Book Copy : "+this.bookCopy);

    }
    public static void totalNumberOfUniqueBooks(){
        System.out.println("Number of Unique Books : "+uniqueBookCounter);
    }

}
