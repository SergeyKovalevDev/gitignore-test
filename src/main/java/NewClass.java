public class NewClass {
    String str;

    public NewClass(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private boolean equals(String s) {
        return str.equals(s);
    }
}
