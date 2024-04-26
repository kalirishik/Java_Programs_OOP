import java.awt.Color;
public class Practice18 {
    public static void main(String[] args) {
        int red = 193;
        int green = 255;
        int blue = 183;
        Color color = new Color(red, green, blue);
        float[] hsbValues = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsbValues[0];
        float saturation = hsbValues[1];
        float brightness = hsbValues[2];
        System.out.println("RGB values: Red = " + red + ", Green = " + green + ", Blue = " + blue);
        System.out.println("HSB values: Hue = " + hue + ", Saturation = " + saturation + ", Brightness = " + brightness);
    }
}
