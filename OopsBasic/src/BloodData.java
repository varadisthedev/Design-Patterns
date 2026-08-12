public class BloodData  {
    char rhtype;
    char isposornegative;
    String name;

    public void setIsposornegative(char isposornegative) {
        this.isposornegative = isposornegative;
    }

    public void setRhtype(char rhtype) {
        this.rhtype = rhtype;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    public char getIsposornegative() {
        return isposornegative;
    }

    public char getRhtype() {
        return rhtype;
    }
}
