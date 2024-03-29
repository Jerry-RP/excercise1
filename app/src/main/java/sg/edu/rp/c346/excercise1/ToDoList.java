package sg.edu.rp.c346.excercise1;

public class ToDoList {

    private String name;

    public ToDoList(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return   name + ": " +
                 version ;
    }

    private String version;

}
