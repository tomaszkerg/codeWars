import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int getin = 0;
    int getout = 0;
    for(int[] stop:stops){
      getin+=stop[0];
      getout+=stop[1];
    }
    return getin-getout;
  }
}
