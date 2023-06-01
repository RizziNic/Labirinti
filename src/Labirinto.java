import java.awt.*;
import javax.swing.*;

public class Labirinto {

    public static void paintMat(Graphics g){
        char[][] mat = Board.getMat();
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat.length; j++) {
                g.setColor(Color.gray);
                if(mat[i][j] == 'X'){
                    g.fillRect(j*100, i*100, 100, 100);
                }
                else if(mat[i][j] == 'U'){
                    g.setColor(Color.green);
                    g.fillRect(j*100, i*100, 100, 100);
                    //Board.getPal().setX(j);
                }
                else if(mat[i][j] == 'E'){
                    g.setColor(Color.red);
                    g.fillRect(j*100, i*100, 100, 100);
                }
            }
            //disegnaPal(g, Board.getPal());
        }


    }




}
