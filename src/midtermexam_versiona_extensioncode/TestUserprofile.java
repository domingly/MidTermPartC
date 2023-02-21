/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Lyn\
 * February 21,2022
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input=new Scanner(System.in);
        String name= input.nextLine();
        String genre= input.nextLine();
        UserProfile user=new UserProfile(name,genre);
        System.out.println("User profile was successfully created");
        
    }
    
}
