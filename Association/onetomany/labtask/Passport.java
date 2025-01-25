package labtask;

public class Passport {
    private String passportNo;
    private int pages;
    private String expireDate;
    Passport(){}
    Passport(String passportNo, String expireDate,int pages){
        this.passportNo = passportNo;
        this.expireDate = expireDate;
        this.pages = pages;
        }
        public void setPassportNo(String passportNo){
            this.passportNo = passportNo;
        }
        public void setExpiredate(String expireDate){
            this.expireDate = expireDate;
        }
        public void setPages(int pages){
            this.pages = pages;
        }

        public String getPassportNo(){return this.passportNo;}
        public String getExpireDate(){return this.expireDate;}
        public int getPages(){return this.pages;}

        public void showPassportInfo(){
            System.out.println("Passport NO : "+this.passportNo);
            System.out.println("Expire Date : "+this.expireDate);
            System.out.println("Pages : "+this.pages);
        }


}
