package String;

public class example {
    public static void ex4(){
        String s1=new String("You cannot change me");
        String s2=new String("You cannot change me");
        System.out.println(s1==s2);

        String s3="You cannot change me";
        System.out.println(s1==s3);

        String s4="You cannot change me";
        System.out.println(s3==s4);

        String s5="You cannot "+"change me";
        System.out.println(s4==s5);

        String s6="You cannot ";
        String s7=s6+"change me";
        System.out.println(s4==s7);

        final String s8="You cannot ";
        String s9=s8+"change me";
        System.out.println(s4==s9);
    }

    public static void ex5(){
        String s1=new String("java");
        String s2=s1.toLowerCase();
        String s3=s1.toUpperCase();
        System.out.println(s2==s1);
        System.out.println(s3==s1);
    }

    public static void ex6(){
        String s1="java";
        String s2=s1.toString();
        String s3=s1.toLowerCase();
        String s4=s1.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
    }

    public static void ex7(){
        String s=" ";
        s.trim();
        System.out.println(s.equals("")+"     "+s.isEmpty());
    }

    public static void ex9(){
        
    }
    public static void main(String[] args) {
        ex4();
        ex5();
        ex6();
        ex7();
    }

}
