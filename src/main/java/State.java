import java.awt.image.BufferedImage;
import java.util.Objects;

class State {
    private final BufferedImage baseImage;
    private final int hue;

    public State(BufferedImage baseImage, int hue) {
        this.baseImage = baseImage;
        this.hue = hue;
    }

    public BufferedImage getBaseImage() {
        return baseImage;
    }

    public int getHue() {
        return hue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        if (hue != state.hue) return false;
        return Objects.equals(baseImage, state.baseImage);
    }

    @Override
    public int hashCode() {
        int result = baseImage != null ? baseImage.hashCode() : 0;
        result = 31 * result + hue;
        return result;
    }
}
