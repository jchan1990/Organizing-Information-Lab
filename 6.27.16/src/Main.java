/**
 * Created by Qube on 6/27/16.
 */
public class Main {

    public static StopLight stopLight = new StopLight("YELLow");
    public static Car acuraNSX = new Car("Gray,", "Acura", 191);

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            if (stopLight.isGreen()) {
                acuraNSX.go();
                stopLight.setLightColor("yelLOW");
            }
            else if (stopLight.isYellow()) {
                acuraNSX.slow();
                stopLight.setLightColor("rED");
            }
            else if (stopLight.isRed()) {
                acuraNSX.stop();
                stopLight.setLightColor("GReeN");
            }
            else {
                System.out.println("Broken stoplight! Speed up!");
            }

        }
    }
}
