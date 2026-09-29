import java.util.ArrayList;
import java.util.List;


interface MyFolder{
    float showSize();
    void myData();
}

class File implements MyFolder{
    private String nameofFile;
    private float size;

    File(String nameofFile, float size){
        this.nameofFile = nameofFile;
        this.size = size;
    }

    @Override   
    public float showSize() {
        return size;
    }

    @Override
    public void myData() {
        System.out.println("File name: " + nameofFile + ", Size: " + size + " MB");
    }
}

class Folder implements MyFolder{
    private String nameofFolder;
    private List<MyFolder> myFolders = new ArrayList<>();

    Folder(String nameofFolder){
        this.nameofFolder = nameofFolder;
    }

    public void add(MyFolder myFolder){
        myFolders.add(myFolder);
    }

    public void remove(MyFolder myFolder){
        myFolders.remove(myFolder);
    }

    @Override
    public float showSize() {
        float totalSize = 0;
        for (MyFolder myFolder : myFolders) {
            totalSize += myFolder.showSize();
        }
        return totalSize;
    }

    @Override
    public void myData() {
        System.out.println("Folder name: " + nameofFolder + ", Total Size: " + showSize() + " MB");
        for (MyFolder myFolder : myFolders) {
            myFolder.myData();
        }
    }
}

class CompositeDemo {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 2.5f);
        File file2 = new File("file2.txt", 3.0f);
        File file3 = new File("file3.txt", 1.5f);

        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.add(file3);
        folder2.add(folder1); // Adding folder1 to folder2

        folder2.myData(); // Display data of folder2 and its contents
    }
}
