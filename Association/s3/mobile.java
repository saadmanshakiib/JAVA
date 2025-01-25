package OOP.Association.s3;

public class mobile {
    private Contact contact[];
    mobile(){}

    mobile(int sent){
        this.contact = new Contact[sent];
    }

    public void setContact(Contact sent){
        for(int i=0;i<contact.length;i++){
            if(contact[i]==null){
                contact[i]=sent;
                break;
            }
        }
    }
    public void deleteContact(Contact sent){
        for(int i=0;i<contact.length;i++){
            if(contact[i]==sent){
                contact[i]=null;
                break;
            }
        }
    }

    public void printallcontacts(){
        for(int i=0;i<contact.length;i++){
            if(contact[i]!=null){
                contact[i].showContactDetails();
                System.out.println();
            }
        }
    }
    
}
