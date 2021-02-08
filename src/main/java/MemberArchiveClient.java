/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 * A simple client program to test the functionality of the
 * MemberArchive and underlaying classes.
 *
 * @author arne
 */
public class MemberArchiveClient {

    public static void main(String[] args)
    {
        MemberArchive memberArchive = new MemberArchive();

        memberArchive.listAllMembers();

        System.out.println("\nAdd some bonuspoints to all of the members..\n");

        System.out.println("Member 1 gets 10.000");
        memberArchive.registerPoints(1, 10000);

        System.out.println("Member 2 gets 10.000");
        memberArchive.registerPoints(2, 10000);

        System.out.println("Member 3 gets 10.000");
        memberArchive.registerPoints(3, 10000);

        System.out.println("Member 4 gets 10.000");
        memberArchive.registerPoints(4, 10000);

        System.out.println("Member 5 gets 10.000");
        memberArchive.registerPoints(5, 10000);

        System.out.println("Now lets see the register:\n");
        memberArchive.listAllMembers();

    }

    public int newPointsInput()
    {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int inputPoints = 0;
        System.out.println("Please enter the amount of point to add:");
        while(!validInput)
        {
            try
            {
                inputPoints = sc.nextInt();
                System.out.println("The new point has been added to the members balance.");
                validInput = true;
            } catch (Exception e)
            {
                System.out.println("You need to enter a number! Try again:");
            }
        } return inputPoints;
    }
}