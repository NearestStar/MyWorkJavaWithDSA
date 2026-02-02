package String;

public class printAToB {
    public static void printAToBInString(){
        String series="";
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);
    }
    public static void printAToBInStringBuffer(){
        StringBuffer series=new StringBuffer();
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            series.append(ch);
        }
        System.out.println(series);
    }

    public static void main(String[] args) {
        printAToBInString();
        printAToBInStringBuffer();
    }
}
