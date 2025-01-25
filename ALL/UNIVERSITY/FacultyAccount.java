public class FacultyAccount {
        private String name;
        private String email;
        private String contactno;
        private String DOB;
        private String nationality;

        FacultyAccount(){}
        FacultyAccount(String name,String email,String contactno,String DOB,String nationality){
            this.name = name;
            this.email = email;
            this.contactno = contactno;
            this.DOB = DOB;
            this.nationality = nationality;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setContactno(String contactno){
            this.contactno = contactno;
        }
        public void setDOB(String DOB){
            this.DOB = DOB;
        }
        public void setNationality(String nationality){
            this.nationality = nationality;
        }

        public String getName()
        {
            return this.name;
        }
        public String getEmail()
        {
            return this.email;
        }
        public String getContactno()
        {
            return this.contactno;
        }
        public String getDOB()
        {
            return this.DOB;
        }
        public String getNationality()
        {
            return this.nationality;
        }

        public void printaccountdetails(){
            System.out.println("Account Details : ");
            System.out.println("Full Name : "+this.name);
            System.out.println("Email : "+this.email);
            System.out.println("Contact NO : "+this.contactno);
            System.out.println("Date Of Birth : "+this.DOB);
            System.out.println("Nationality : "+this.nationality);
        }
}
