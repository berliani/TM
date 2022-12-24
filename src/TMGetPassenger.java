import java.util.ArrayList;

public class TMGetPassenger {
    public static void main(String[] args) {
        ArrayList<int[]> stopGo = new ArrayList<int[]>();
        stopGo.add(new int[]{10, 0});
        stopGo.add(new int[]{3, 5});
        stopGo.add(new int[]{2, 5});
        System.out.println(GetPassenger(stopGo));
    }

    public static int GetPassenger(ArrayList<int[]> BisKota) {
        int hitungpenumpang = 0;
        for (int[] stop : BisKota) {
            hitungpenumpang += stop[0];
            hitungpenumpang -= stop[1];
        }
        return hitungpenumpang;
    }
}

