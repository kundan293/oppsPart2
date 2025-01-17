import JAva.Interface.Football;
import JAva.Interface.Playable;
import JAva.Interface.Vollyball;

public class sports {
    public static void main(String[]args){
  Football play = new Football();
  play.play();

  Playable vollyball = new Vollyball();
  vollyball.play();

  Playable playable = new Baskettball();
  playable.play();

    }
}
