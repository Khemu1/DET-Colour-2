package DET;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = validateColorComponent(red);
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = validateColorComponent(green);
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = validateColorComponent(blue);
    }

    private int validateColorComponent(int value) {
        return Math.max(0, Math.min(255, value));
    }
}
