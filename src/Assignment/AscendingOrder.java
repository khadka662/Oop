package Assignment;

public class AscendingOrder {
    public static void main(String[] args) {
        String str[] ={"Ram","Hari","Anit","Mohit"};
        String temp;
        System.out.println("strings in ascending order:");
        for(int j =0;j<str.length; j++){
            for (int i=j+1;i<str.length;i++){
                if(str[i].compareTo(str[j])<0){
                    temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
            System.out.println(str[j]);

        }
    }
}
