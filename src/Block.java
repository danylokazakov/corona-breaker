import javax.tools.Tool;
import java.awt.*;

public class Block extends Rectangle {
    Image pic;
    Block(int a, int b, int w, int h, String s){
        x=a;
        y=b;
        width=w;
        height=h;
        pic= Toolkit.getDefaultToolkit().getImage(s);
    }
    public void draw(Graphics g, CoronaBreaker c){
        g.drawImage(pic,x,y,width,height,c);

    }

}
