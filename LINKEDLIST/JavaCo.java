import java.util.*;
class Database{
	private String isbn,title,author,genre,availability;
	public void setISBN(String isbn){
		this.isbn = isbn;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public void setAvailability(String availability){
		this.availability = availability;
	}

	public String getISBN(){return this.isbn;}
	public String getTitle(){return this.title;}
	public String getAuthor(){return this.author;}
	public String getGenre(){return this.genre;}
	public String getAvailability(){return this.availability;}

	
	void display(){
		System.out.println("ISBN="+isbn);
		System.out.println("Title="+title);
		System.out.println("Author="+author);
		System.out.println("Genre="+genre);
		System.out.println("Availability="+availability);
	}
}
public class JavaCo {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		Database Book1=new Database();
		System.out.println("Enter the isbn : ");
		String isbn = in.nextLine();
		Book1.setISBN(isbn);
		System.out.println("Enter the title : ");
		String title = in.nextLine();
		Book1.setTitle(title);
		System.out.println("Enter the Author name : ");
		String author= in.nextLine();
		Book1.setAuthor(author);
		System.out.println("Enter the Genre : ");
		String genre = in.nextLine();
		Book1.setGenre(genre);
		System.out.println("Enter the Availability : ");
		String a  = in.nextLine();
		Book1.setAvailability(a);
		Book1.display();
		
	}
}