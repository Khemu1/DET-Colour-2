package DET;

public class AlphaChannelColor extends Color {
    private int alpha;

    public AlphaChannelColor(int red, int green, int blue, int alpha) {
        super(red, green, blue);
        setAlpha(alpha);
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = validateAlpha(alpha);
    }

    private int validateAlpha(int value) {
        return Math.max(0, Math.min(255, value));
    }
}
