import java.io.*;


public class Main {
    public static void main(String[] args) {
        String s;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("labirinto.txt"));
            s=reader.readLine();
            while (s != null) {
                System.out.println(s);
                s = reader.readLine();

            }
            reader.close();




        } catch (Exception e){
            System.out.println(e);
        }

    }
}