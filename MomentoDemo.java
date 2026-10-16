
class TextEditor {
    private String text = "";

    void type(String words) {
        text += words;
    }

    Memento save() {
        return new Memento(text);
    }

    void restore(Memento memento) {
        text = memento.text;
    }

    void show() {
        System.out.println(text);
    }

    // Memento
    static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }
    }
}

public class MomentoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        TextEditor.Memento saved = editor.save();

        editor.type(" World!");
        editor.restore(saved);

        editor.show(); // Hello
    }
}
