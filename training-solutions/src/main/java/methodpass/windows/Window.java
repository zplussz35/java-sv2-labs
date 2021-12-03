package methodpass.windows;

public class Window {
    String roomName;
    int width;
    int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
