package LabTAsk2;


public class Person {
        private String name;
        private int age;
        private Passport pp[];
        Person(){}
        Person(String name,int age,int size){
            this.name = name;
            this.age = age;
            this.pp = new Passport[size];
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
       
        public void AddPassport(Passport sent){
            boolean check = false;
            for(int i=0;i<pp.length;i++){
                if(pp[i]==null){
                pp[i] = sent;
                }
                check = true;
            }
            if(check==true){
                System.out.println("Passport set");
            }
            else{
                System.out.println("Error");
            }
        }
        

        public void DeletePassport(Passport sent){
            boolean check = false;
            for(int i=0;i<pp.length;i++){
                if(pp[i]==sent){
                    pp[i] = null;
                    check = true;
                }
            }
            if(check==true){
                System.out.println("Passport deleted");
            }
            else{
                System.out.println("Error");
            }
        }
        public void showallpassports(){
            for(int i=0;i<pp.length;i++){
                if(pp[i]!=null){
                System.out.println("Passport no : "+(i+1));
                pp[i].showPassportInfo();
            }
        }
        }


}
