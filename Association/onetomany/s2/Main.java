package s2;

public class Main {
    public static void main(String[] saa){
        Contact c1 = new Contact("Saadman","01615878967");
        Contact c2 = new Contact("Nissan","01741942985");
        Contact c3 = new Contact("Amiya","01717478856");
        Contact c4 = new Contact("Sakib","01615828990");
        Contact c5 = new Contact("Shakib","01615823190");
        Contact c6 = new Contact("Sohiab","01631218990");


            Phone p = new Phone(7);
            p.setcontact(c1);
            p.setcontact(c2);
            p.setcontact(c3);
            p.setcontact(c4);

                    p.showallnumbers();

            p.insertnewnumber(c5);
            p.insertnewnumber(c6);
                    p.showallnumbers();
                    p.showacontact(c4);

            
            

    }
}
