// Proxy Pattern (virtual proxy): delay creating an expensive object until it's actually needed.

interface Image {
    void display();
}

// Real object: expensive
class RealImage implements Image {
    private final String file;

    RealImage(String file) {
        this.file = file;
        System.out.println("Loading " + file + " from disk (expensive)...");
    }

    public void display() {
        System.out.println("Displaying " + file);
    }
}

class ProxyImage implements Image {
    private final String file;
    private RealImage realImage; // created lazily

    ProxyImage(String file) {
        this.file = file;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file); // load only on first use
        }
        realImage.display();
    }
}

// Client
public class ProxyDemo {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.jpg");

        System.out.println("Proxy created, nothing loaded yet");
        img.display(); // loads + displays
        img.display(); // already loaded, just displays
    }
}