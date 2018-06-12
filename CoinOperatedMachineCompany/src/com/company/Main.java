package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] arg) {
        //Customer is at location SharedSpace.
        String location = "SharedSpace";
        SnackMachine sharedSpaceSnackMachine = new SnackMachine("SharedSpace", 0, 0, 0);
        DrinkMachine sharedSpaceDrinkMachine = new DrinkMachine("SharedSpace", 0, 0, 0);

        //String = location, Machine = name of machine object
        Map<String, ArrayList<Machine>> listOfMachineByLocation = new HashMap<String, ArrayList<Machine>>();
        ArrayList<Machine> listOfMachinesatSharedSpace = new ArrayList<>();
        listOfMachinesatSharedSpace.add(sharedSpaceDrinkMachine);
        listOfMachinesatSharedSpace.add(sharedSpaceSnackMachine);

        listOfMachineByLocation.put("Shared Space", listOfMachinesatSharedSpace);


        sharedSpaceSnackMachine.loadMachine();
        sharedSpaceDrinkMachine.loadMachine();


        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            boolean powerdown = false;
            while (!powerdown) {


                System.out.println("Select 1 for Snack Machine. \n" +
                        "Select 2 for Drink Machine.");
                String machineSelect = console.readLine();

                if (machineSelect.equals("1")) {
                    System.out.println("Welcome to " + sharedSpaceSnackMachine.getCompanyName() + " Snack Machine.");

                    //Insert Coins
                    System.out.println("Please insert coins.\nEnter # of quarters:");
                    String quarterInput = console.readLine();
                    int quarters = Integer.parseInt(quarterInput);
                    sharedSpaceSnackMachine.addQuarters(quarters);

                    System.out.println("Enter # of dimes:");
                    String dimeInput = console.readLine();
                    int dimes = Integer.parseInt(dimeInput);
                    sharedSpaceSnackMachine.addDimes(dimes);

                    System.out.println("Enter # of nickels:");
                    String nickelInput = console.readLine();
                    int nickels = Integer.parseInt(nickelInput);
                    sharedSpaceSnackMachine.addNickels(nickels);

                    //Display Total
                    System.out.printf("You have entered $" + "%.2f\n", sharedSpaceSnackMachine.getTotal());
                    double moneyCustomerEntered = sharedSpaceSnackMachine.getTotal();

                    //Display Vending Menu
                    sharedSpaceSnackMachine.displayVendingMenu();

                    //Select item
                    String itemSelect = console.readLine();
                    String[] arrayToSplitItemSelectString = itemSelect.split("");
                    // if can : [A , . , i , . , j]=[0, . , 2 , . ,4] i=ArrayList of first column; j=ArrayList across rows
                    //if bottle : [B , . , i , . , j] = [0, . , 2 , . , 4]
                    String letterIndicator = arrayToSplitItemSelectString[0];

                    int i = Integer.parseInt(arrayToSplitItemSelectString[2]);
//
                    int j = Integer.parseInt(arrayToSplitItemSelectString[4]);

                    System.out.println("You have selected " + sharedSpaceSnackMachine.getProductNameFromCode(letterIndicator, i, j) + ".\n");
                    sharedSpaceSnackMachine.coinAndItemExchange(letterIndicator, i, j, moneyCustomerEntered);

                } else if (machineSelect.equals("2")) {
                    System.out.println("Welcome to " + sharedSpaceDrinkMachine.getCompanyName() + " Drink Machine.");

                    //Insert Coins
                    System.out.println("Please insert coins.\nEnter # of quarters:");
                    String quarterInput = console.readLine();
                    int quarters = Integer.parseInt(quarterInput);
                    sharedSpaceDrinkMachine.addQuarters(quarters);

                    System.out.println("Enter # of dimes:");
                    String dimeInput = console.readLine();
                    int dimes = Integer.parseInt(dimeInput);
                    sharedSpaceDrinkMachine.addDimes(dimes);

                    System.out.println("Enter # of nickels:");
                    String nickelInput = console.readLine();
                    int nickels = Integer.parseInt(nickelInput);
                    sharedSpaceDrinkMachine.addNickels(nickels);

                    //Display Total
                    System.out.printf("You have entered $" + "%.2f\n", sharedSpaceDrinkMachine.getTotal());
                    double moneyCustomerEntered = sharedSpaceDrinkMachine.getTotal();

                    //Display Vending Menu
                    sharedSpaceDrinkMachine.displayVendingMenu();

                    //Select item
                    String itemSelect = console.readLine();
                    String[] arrayToSplitItemSelectString = itemSelect.split("");
                    // if can : [A , . , i , . , j]=[0, . , 2 , . ,4] i=ArrayList of first column; j=ArrayList across rows
                    //if bottle : [B , . , i , . , j] = [0, . , 2 , . , 4]
                    String canOrBottleSelection = arrayToSplitItemSelectString[0];

                    int i = Integer.parseInt(arrayToSplitItemSelectString[2]);
//
                    int j = Integer.parseInt(arrayToSplitItemSelectString[4]);

                    System.out.println("You have selected " + sharedSpaceDrinkMachine.getProductNameFromCode(canOrBottleSelection, i, j) + ".\n");
                    sharedSpaceDrinkMachine.coinAndItemExchange(canOrBottleSelection, i, j, moneyCustomerEntered);
//                } else if (machineSelect.equals(Machine.securityCode)) {
////                    System.out.println("Operator access granted. Please select your action."
////                            + "\n" + "1 to Add a machine."
////                            + "\n" + "2 to Remove a machine."
////                            + "\n" + "3 to Check amount in specific machine."
////                            + "\n" + "4 to Check amount in all machines."
////                            + "\n" + "5 to Check status at location.");
////                    int operatorInput = Integer.parseInt(console.readLine());
////                    switch (operatorInput) {
////                        case 1:
////                            System.out.println("Enter location:");
////                            String newLocation = console.readLine();
////                            System.out.println("Enter machine type:");
////                            String newMachineType = console.readLine();
////                            if (newMachineType.equals("snack")) {
////                                if (listOfMachineByLocation.containsKey(newLocation)) {
////                                    listOfMachineByLocation.get(newLocation).add(new SnackMachine(newLocation, 0, 0, 0));
////                                } else {
////                                    ArrayList<Machine> newArr = new ArrayList<>();
////                                    newArr.add(new SnackMachine(newLocation, 0, 0, 0));
////                                    listOfMachineByLocation.put(newLocation, newArr);
////                                }
////
////                            } else {
////                                if (listOfMachineByLocation.containsKey(newLocation)) {
////                                    listOfMachineByLocation.get(newLocation).add(new DrinkMachine(newLocation, 0, 0, 0));
////                                } else {
////                                    ArrayList<Machine> newArr = new ArrayList<>();
////                                    newArr.add(new DrinkMachine(newLocation, 0, 0, 0));
////                                    listOfMachineByLocation.put(newLocation, newArr);
////                                }
////
////                            }
////                            //Test for machine added to location: nextDoor
//////                            System.out.println(listOfMachineByLocation.get("nextDoor").get(0).getLocation());
////
////                            break;
////                        case 2:
////                            System.out.println("Enter location:");
////                            String oldLocation = console.readLine();
////                            System.out.println("Enter machine type:");
////                            String oldMachineType = console.readLine();
////                            if ( oldMachineType.equals("snack")) {
////                                listOfMachineByLocation.get(oldLocation).remove();
////                            }
////
////                            break;
////                        case 3:
////
////
////                            break;
////                        case 4:
////                            break;
////                        case 5:
////                            System.out.println("Enter location:");
////                            String specificLocation = console.readLine();
////
////
////                            break;
////                        default:
////                            break;
//                }
//
//            } else {
                    System.out.println("Invalid Entry");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }

}



