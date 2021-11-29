package FamilyProject;

import java.util.ArrayList;
import java.util.List;

public class Father {

    private String name;
    private String lastname;
    static double budget = 5000;
    private List<Product> list = new ArrayList<>();//This is the list of Items we buy
    private Requirement requirement;//this is the items that we plan to buy

    public Father() {
    }
    
    public Father(String name, String lastname, List<Product> list, Requirement requirement) {
        this.name = name;
        this.lastname = lastname;
        this.list = list;
        this.requirement = requirement;
    }

    public static void buyProduct(double budget) {
        Father.budget -= budget;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public static double getBudget() {
        return budget;
    }
    public static void setBudget(double budget) {
        Father.budget = budget;
    }
    public List<Product> getList() {
        return list;
    }
    public void setList(List<Product> list) {
        this.list = list;
    }
    public Requirement getRequirement() {
        return requirement;
    }
    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    @Override
    public String toString() {
        return "Father [name=" + name + ", lastname=" + lastname + ", list=" + list + ", requirement=" + requirement
                + "]";
    }

}