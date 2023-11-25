package DET;

public class Main {
    public static void main(String[] args) {
        AlphaChannelColor alphaChannelColor = new AlphaChannelColor(255, 128, 0, 150);

        System.out.println("Color Components: R=" + alphaChannelColor.getRed() +
                " G=" + alphaChannelColor.getGreen() +
                " B=" + alphaChannelColor.getBlue());
        System.out.println("Alpha: " + alphaChannelColor.getAlpha());
    }
}
