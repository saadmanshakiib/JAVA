package shishirlabtask;


public class Book {
    private String Bookname;
    private String Writername;
    Book(){}
    Book(String Bookname,String Writername){
            this.Bookname = Bookname;
            this.Writername = Writername;
    }

    public void setBookname(String Bookname){
        this.Bookname = Bookname;
    }
    public void setBookwritername(String Writername){
        this.Writername = Writername;
    }

    public String getBookname(){return this.Bookname;}
    public String getWritername(){return this.Writername;}

    public void showallbooks(){
        System.out.println("Book : "+this.Bookname);
        System.out.println("Writer : "+this.Writername);
    }

    

}
