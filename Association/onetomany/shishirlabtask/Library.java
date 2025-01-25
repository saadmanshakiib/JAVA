package shishirlabtask;

public class Library {
   // private int librarycode;
    private Book bb[];
    Library(){}

    Library(int size){
        this.bb = new Book[size];
    }
        
    public void insertbook(Book sent){

        boolean check = false;
        for(int i=0;i<bb.length;i++){
            if(bb[i]==null){
                bb[i] = sent;
                break;
            }  
        }
        check = true;
        if(check==true){
            System.out.println("Book Inserted ");
        }
        else{
            System.out.println("Error");
        }
    }


            public void DeleteBook(Book sent){
                boolean check = false;
                for(int i=0;i<bb.length;i++){
                    if(bb[i] == sent){
                        bb[i] = null;
                    }
                    check = true;
                }
                if(check == true){
                    System.out.println("Book Deleted");
                }
                else{
                    System.out.println("Cant Delete Book");
                }
            }

            public void search(Book sent){
               boolean check =  false;
                for(int i=0;i<bb.length;i++){
                    if(bb[i] == sent){
                        System.out.println("Book Found");
                        System.out.println(bb[i]);
                        check = true;
                    }
                }
                    if(check==false){
                        System.out.println("Cant Find");
                    }
                    
            }

    public void print(){
        for(int i=0;i<bb.length;i++){
            if(bb[i]!=null){
            System.out.println("Book "+(i+1));
            bb[i].showallbooks();
            }
        }
    }

    
}

