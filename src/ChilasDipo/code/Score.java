package ChilasDipo.code;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;
public class Score {
   private int x;
    private  int y;
    private Random random = new Random();
    private ImageView imageView = new ImageView();
    private int plusscore;
    public int getPlusscore() { return plusscore+1; }
    public ImageView getImageView() { return imageView; }
    public Score() { newrandomcoordinates(); }
    void newrandomcoordinates(){
        x =  random.nextInt(9);
        y =  random.nextInt(9);
        plusscore = random.nextInt(3);
        newimage();
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    Boolean pickedornor(int cx, int cy){
        if (x == cx & y == cy ){
            System.out.println("plus one in score");
            return true;
        }
        return false;
    }
        void newimage(){
            switch (plusscore) {
                case 0:
                    imageView.setImage(new Image("ChilasDipo/Pictures/bronze.png"));
                    break;
                case 1:
                    imageView.setImage(new Image("ChilasDipo/Pictures/silver.png"));
                    break;
                case 2:
                    imageView.setImage(new Image("ChilasDipo/Pictures/gold.png"));
                    break;
            }
        }
    }