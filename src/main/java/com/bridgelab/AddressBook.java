package com.bridgelab;

import java.util.Scanner;


public class AddressBook {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book!");

        int  input;
        int ans;
        AddressService object = new AddressService();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact");
            System.out.println("2.Edit a contact");
            input = scanner.nextInt();
            switch(input)
            {
                case 1:
                    object.Add();
                    break;
                case 2:
                    object.Edit();
                    break;
                default:System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue?(0/1)");
            ans=scanner.nextInt();
        }while(ans==1);
    }

}

