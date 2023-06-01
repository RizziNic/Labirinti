import java.io.FileReader;
import javax.swing.*;

public class Board {

    static char[][] mat = new char[10][10];
    public static char[][] getMat(){
        return mat;
    }

    public static void init() {
        char c;

        try {
            FileReader in = new FileReader("labirinto.txt");

            c = (char) in.read();
            while (c != (char) (-1)) {
                for (int i=0;i < mat.length; i++){
                    for (int j=0; j< mat.length; j++){
                        System.out.print(c);
                        //System.out.println("Ho letto il carattere " + c);
                        c = (char) in.read();
                    }
                }
            }
            in.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
