package OOP.Association.s3;

public class main {
public static void main(String[] a){
    Contact c1 = new Contact();
    c1.setName("Sadman");
    c1.setNumber("01615828990");

    Contact c2 = new Contact("Sakib","01741942985");
    Contact c3 = new Contact("Sadab","03535442985");
    Contact c4 = new Contact("Nissan","47328943723");
    Contact c5 = new Contact("Saad","0174545346");



    mobile m = new mobile(5);
    m.setContact(c1);
    m.setContact(c2);
    m.setContact(c3);
    m.setContact(c4);
    m.setContact(c5);
    m.deleteContact(c3);

    m.printallcontacts();


}

}
