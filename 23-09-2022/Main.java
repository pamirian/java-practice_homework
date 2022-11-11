
/*
Если в строке есть  слова с одинаковыми буквами подряд, убираем одну из этих букв
 */
public class Main {

    public static void main(String[] args) {
        String str="llhello all. Java is easy!";

        String result=""+str.charAt(0);
        for (int i=1; i<str.length();i++){
            char ch1=str.charAt(i-1);
            char ch2=str.charAt(i);
            if(ch2=='l'&& ch1=='l'){
                continue;
            } else {
                result=result+ch2;
            }
        }
        System.out.println("1:  "+result);

        // второе решение

        result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch!='l'){
                result=result+ch;
            } else {
                if (result.length()==0||result.charAt(result.length()-1)!='l'){
                    result=result+ch;
                }
            }
        }


        System.out.println("2:  "+result);

    }
}