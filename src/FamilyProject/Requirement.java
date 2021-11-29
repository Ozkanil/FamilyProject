package FamilyProject;

import java.util.ArrayList;
import java.util.List;

public class Requirement {

    private List<Product> list = new ArrayList<>();

    public Requirement() {
    }
    public Requirement(List<Product> list) {
        this.list = list;
    }
    public List<Product> getList() {
        return list;
    }
    public void setList(List<Product> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "Requirement [list=" + list + "]";
    }


}