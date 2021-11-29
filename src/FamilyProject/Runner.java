package FamilyProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Runner {

    public static void main(String[] args) {

        Father father = new Father();
        father.setName("Jaber");
        father.setLastname("Cool");

        Product product = new Product();
        product.setName("camera");

        Product product2 = new Product();
        product2.setName("phone");

        List<Product> itemsToby = new ArrayList<>();
        itemsToby.add(product);
        itemsToby.add(product2);

        Requirement requirement = new Requirement(itemsToby);
        Son son = new Son();
        son.setName("Jacob");
        son.setLastname("Bolt");
        son.setHappy(true);

        System.out.println("Father's current budget: " + Father.budget);
        father.setRequirement(requirement);
        System.out.println(father.getRequirement());

        father.setList(shoppingCenter(father));
        System.out.println(father.getList());
        System.out.println(Father.getBudget());

    }

        public static List<Product> shoppingCenter(Father father) {
            List<Product> boughtItems = new ArrayList<>();
            String items = "camera, grenade, phone, TV, pen, pencil";
            String price = "500, 1500, 600, 500, 10, 5";

            String[] itemsArray = items.split(",");
            String[] priceArray = price.split(",");

            List<Product> currentList = father.getRequirement().getList();

            for (Product each : currentList) {

                for (int i = 0; i < itemsArray.length; i++) {

                    if (each.getName().equalsIgnoreCase(itemsArray[i].trim())) {

                        if (Father.getBudget() > Double.parseDouble(priceArray[i].trim())) {

                            Product product = new Product();
                            product.setName(itemsArray[i].trim());
                            product.setPrice(Double.parseDouble(priceArray[i].trim()));

                            boughtItems.add(product);
                            Father.buyProduct(product.getPrice());
                            break;

                        } else {
                            System.out.println("Your budget is not enough!");

                        }

                    }

                }
            }return boughtItems;
        }}



