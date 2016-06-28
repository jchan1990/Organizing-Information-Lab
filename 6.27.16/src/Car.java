/**
 * Created by Qube on 6/27/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

    public Car(String color, String brand, int topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go() {
        System.out.println("Speed up!");
    }

    public void slow() {
        System.out.println("Can we make it? Damn where's the E-brake!");
    }

    public void stop() {
        System.out.println("OMG Stop! Bail! Bail! Bail!");
    }

    public String getmColor() {
        return mColor;
    }

    public String getmBrand() {
        return mBrand;
    }

    public int getmTopSpeed() {
        return mTopSpeed;
    }

    public void setmColor(String color) {
        mColor = color;
    }

    public void setmBrand(String brand) {
        mBrand = brand;
    }

    public void setmTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

}
