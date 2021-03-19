package pl.wsb.quiz.exercises.enums;

public enum Color {
    // static final Color RED = new Color(10, 100)
    RED(0xF00, 2617),
    BLUE(0x0F0, 2443),
    GREEN(0x00F,56),
    BLACK(0x000, 0);
    private int rgb;
    private int hsb;

    Color(int rgb, int hsb) {
        this.rgb = rgb;
        this.hsb = hsb;
    }

    public int getRgb() {
        return rgb;
    }

    public int getHsb() {
        return hsb;
    }
}
