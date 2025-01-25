package studentAddress;

public class StudentAddress {
    private String city;
    private String zipcode;

    StudentAddress(){}
    StudentAddress(String city,String zipcode){
        this.city = city;
        this.zipcode = zipcode;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String getCity(){return this.city;}
    public String getZipcode(){return this.zipcode;}
    public void show(){
        //Student.print();
        System.out.println("City : "+this.city.toUpperCase());
        System.out.println("Zipcode : "+this.zipcode);
    }
    public void printaddress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printaddress'");
    }
}
