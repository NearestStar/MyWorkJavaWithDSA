package String;

public class MyString {
    private String str;
    MyString(String str){
        this.str=str;
    }

    public MyString modify(String str){

        if(this.str==str){
            return this;
        }else{
            return new MyString(str);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return str;
    }

    public static void main(String[] args) {
        MyString s=new MyString("Bhaskar");
        MyString modify s1=new MyString modify("Bhaskar");

    }
}
