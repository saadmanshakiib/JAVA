package s2;

public class Phone {
        private Contact contact[];
        Phone(){}
        Phone(int size){
            this.contact = new Contact[size];
        }
        
        public void setcontact(Contact sent){
            for(int i=0;i<contact.length;i++){
                if(contact[i] == null){
                    contact[i] = sent;
                    break;
                }
            }
        }
        public void showallnumbers(){
            for(int i=0;i<contact.length;i++){
                if(contact[i] != null){
                    contact[i].print();
                    System.out.println();
                }
            }
        }
        public void insertnewnumber(Contact sent){
            boolean check = false;
            for(int i=0;i<contact.length;i++){
                if(contact[i] == null){
                    contact[i] = sent;
                    check = true;
                    break;
                }
            }
            if(check == true){
                System.out.println("Contact Updated");
                
            }
            else{
                System.out.println("Cant Update"); 
                
            }
        }
            public void showacontact(Contact sent){
                for(int i=0;i<contact.length;i++){
                    if(contact[i]==sent){
                        contact[i].print();
                        System.out.println();
                    }
                }
            }
            public void searchcontact(Contact sent){
                for(int i=0;i<contact.length;i++){
                    if(contact[i]==sent){
                        contact[i].print();
                        System.out.println();
                    }
                }
            }
            /*public void searchbyname(String n){
                Contact c = new Contact();
                c.searchbyName(n);
            }
            public void searchbyNumber(String n){
                Contact c = new Contact();
                c.searchbyNumber(n);
            }*/
            }
        
    


