public class student {
    int count=0;
    student(){
            count++;
    }
    public void show(){
        System.out.println(count);
    }
    public static void main(String[] atsg){
        student s1 = new student();
        s1.show();
        student s2 = new student();
        s2.show();
        student s3 = new student();
        s3.show();
    }
    
}
