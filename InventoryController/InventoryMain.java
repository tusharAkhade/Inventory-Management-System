package InventoryController;
import InventoryModel.Inventory;
import InventoryService.InventoryService;
import InventoryService.InventoryServiceInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class to read Inventory name, price of inventory and weight of inventory from user.
 * And perform CRED operation.
 * @author Tushar Akhade
 * @since 20 Jun 2021
 */
public class InventoryMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        InventoryServiceInterface inventoryServiceInterface = new InventoryService();
        ArrayList<Inventory> inventoryArrayList = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("1 - Add Inventory\n2 - View Inventory\n3 - Edit Inventory\n4 - Delete Inventory\n5 - Exit");
            int choice = scanner.nextInt();
            Inventory inventory = new Inventory();

            switch (choice) {
                case 1:
                    inventoryServiceInterface.addInventory(inventory, inventoryArrayList);
                    break;
                case 2:
                    inventoryServiceInterface.viewInventory(inventoryArrayList);
                    break;
                case 3:
                    inventoryServiceInterface.editInventory(inventoryArrayList);
                    break;
                case 4:
                    inventoryServiceInterface.deleteInventory(inventoryArrayList);
                    break;
                default:
                    flag = false;
            }
        }
    }
}
