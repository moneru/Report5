/**
 * Created by e165743H on 2016/12/12.
 */
public class Main {
    public static void main(String [] args){
        String str = "3．14";
        Double.parseDouble(str);
        try {
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println(e.toString() + "が発生しました");
            e.printStackTrace();
        }
    }
}

