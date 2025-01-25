package s2;

public class Contact {
    private String number;
    private String name;
        Contact(){}
        Contact(String name,String number){
            this.name = name;
            this.number = number;
        }
        public void setnumber(String number){
            this.number =  number;
        }
        public void setname(String name){
            this.name = name;
        }
        public void print(){
            System.out.println("Contact Name  : "+this.name);
            System.out.println("Contact Number  : "+this.number);
        }
        public void searchbyName(String n){
            if(name == n){
                System.out.println("Contact Matched");
            }
            else{
                System.out.println("No Contact Found");
            }
        }
        public void searchbyNumber(String n){
            if(number == n){
                System.out.println("Contact Matched");
            }
            else{
                System.out.println("No Contact Found");
            }
        }
        }

