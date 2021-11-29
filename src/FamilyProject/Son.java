package FamilyProject;

import java.util.ArrayList;
import java.util.List;

public class Son extends Father{

        private String name;
        private String lastname;
        private boolean isHappy;
        private List<Product> list = new ArrayList<>();
        private Requirement requirement;

        public Son() {
        }

        public Son(String name, String lastname, boolean isHappy, List<Product> list, Requirement requirement) {
            this.name = name;
            this.lastname = lastname;
            this.isHappy = isHappy;
            this.list = list;
            this.requirement = requirement;
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
        public boolean isHappy() {
            return isHappy;
        }
        public void setHappy(boolean isHappy) {
            this.isHappy = isHappy;
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
            return "Son [name=" + name + ", lastname=" + lastname + ", isHappy=" + isHappy + ", list=" + list
                    + ", requirement=" + requirement + "]";
        }

    }