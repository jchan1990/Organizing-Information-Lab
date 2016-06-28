/**
 * Created by Qube on 6/27/16.
 */
public class StopLight {

    String mlightColor;

    public StopLight(String lightColor) {
        mlightColor = lightColor;
    }

    public boolean isRed() {
        if (mlightColor.equalsIgnoreCase("red")) {
            return true;
        }
        return false;
    }

    public boolean isYellow() {
        if (mlightColor.equalsIgnoreCase("yellow")) {
            return true;
        }
        return false;
    }

    public boolean isGreen() {
        if (mlightColor.equalsIgnoreCase("green")) {
            return true;
        }
        return false;
    }

    public void setLightColor(String lightColor) {
        if (isRed()) {
            mlightColor = lightColor;
        }
        else if (isYellow()) {
            mlightColor = lightColor;
        }
        else if (isGreen()) {
            mlightColor = lightColor;
        }
        else {
            System.out.println("broken light");
        }
    }

}
