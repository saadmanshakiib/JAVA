public class Contact {
    private String personName;
    private String personId;
    private String mobileNumber;
    private int age;
    private char gender;

    Contact(){}
        Contact(String personName,String personId,String mobileNumber,int age,char gender){}{
        this.personName = personName;
        this.personId = personId;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.gender = gender;
    }
    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setPersonId(String personId){
        this.personId = personId;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    public String getPersonName(){
        return this.personName;
    }
    public String getPersonId(){
        return this.personId;
    }
    public String getMobileNumber(){
        return this.mobileNumber;
    }
    public int getAge(){
        return this.age;
    }
    public char getGender(){
        return this.gender;
    }
    public void showDetails(){
        System.out.println("Person Name : "+this.personName);
        System.out.println("Person ID : "+this.personId);
        System.out.println("Person Mobile Number : "+this.mobileNumber);
        System.out.println("Person Age : "+this.age);
        System.out.println("Person Gender : "+this.gender);

    }
    public void showOperator(){
        System.out.println("Operator : Banglalink");
    }
}
