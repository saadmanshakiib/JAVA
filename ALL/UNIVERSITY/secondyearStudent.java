public class secondyearStudent extends Student {
        private String id;
        private StudentAccount studentacc;
        secondyearStudent(){}
        secondyearStudent(String name,String dept,double cg,String id){
            super(name,dept,cg);
            this.id = id;
        }
        public void setID(String id){
            this.id = id;
        }
        public void setStudentacc(StudentAccount studentacc){
            this.studentacc = studentacc;
        }
        public StudentAccount getStudentacc(){return this.studentacc;}
        public String getID(){return this.id;}
        @Override
        public void print(){
            super.print();
            System.out.println("ID : "+this.id);
            System.out.println();
        }
}


