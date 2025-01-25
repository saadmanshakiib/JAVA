public class str{
    public static void main(String[] args){
        System.out.println("Welcome");
        String name = "Sadman";
        String name2 = new String("Sakib");
        System.out.println("First name : "+name);
        System.out.println("Second name : "+name2);
        System.out.println("Concating two strings : "+(name+name2));
        System.out.println("First name to upper case : "+name.toUpperCase());
        System.out.println("Last name : "+name2.toLowerCase());
        System.out.println("First name length : "+name.length());
        System.out.println("Last name length : "+name2.length());
        System.out.println(" Index of s in firstname : "+(name.indexOf('S')));
        System.out.println(" Index of k in firstname : "+(name2.indexOf('k')));
        System.out.println("Replace s with i in firstname  : "+(name.replace('S','i')));
        //string s = name.reverse();
    }   
}
   

