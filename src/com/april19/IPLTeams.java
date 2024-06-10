package com.april19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IPLTeams {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        

        HashMap<String, ArrayList<Player>> hm = new HashMap<>();

        hm.put("MI", PlayersStats.m1());
        hm.put("CSK", PlayersStats.m2());
        hm.put("RCB", PlayersStats.m3());
        hm.put("KKR", PlayersStats.m4());
        hm.put("RR", PlayersStats.m5());
        hm.put("PBKS", PlayersStats.m6());
        hm.put("DC", PlayersStats.m7());
        hm.put("GT", PlayersStats.m8());
        hm.put("LSG", PlayersStats.m9());
        hm.put("SRH", PlayersStats.m10());

        System.out.println("IPL Teams:");
        System.out.println("1. Mumbai Indians (MI)");
        System.out.println("2. Chennai Super Kings (CSK)");
        System.out.println("3. Royal Challengers Bangalore (RCB)");
        System.out.println("4. Kolkata Knight Riders (KKR)");
        System.out.println("5. Rajasthan Royals (RR)");
        System.out.println("6. Punjab Kings (PBKS)");
        System.out.println("7. Delhi Capitals (DC)");
        System.out.println("8. Gujarat Titans (GT)");
        System.out.println("9. Lucknow Super Giants (LSG)");
        System.out.println("10. Sunrisers Hyderabad (SRH)");

        System.out.print("\nEnter your choice (1-10): ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        
        switch (choice) {
            case 1:
                displayTeamDetails("Mumbai Indians", hm.get("MI"));
                break;
            case 2:
                displayTeamDetails("Chennai Super Kings", hm.get("CSK"));
                break;
            case 3:
                displayTeamDetails("Royal Challengers Bangalore", hm.get("RCB"));
                break;
            case 4:
                displayTeamDetails("Kolkata Knight Riders", hm.get("KKR"));
                break;
            case 5:
                displayTeamDetails("Rajasthan Royals", hm.get("RR"));
                break;
            case 6:
                displayTeamDetails("Punjab Kings", hm.get("PBKS"));
                break;
            case 7:
                displayTeamDetails("Delhi Capitals", hm.get("DC"));
                break;
            case 8:
                displayTeamDetails("Gujarat Titans", hm.get("GT"));
                break;
            case 9:
                displayTeamDetails("Lucknow Super Giants", hm.get("LSG"));
                break;
            case 10:
                displayTeamDetails("Sunrisers Hyderabad", hm.get("SRH"));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
		}

    private static void displayTeamDetails(String teamName, ArrayList<Player> players) {
    	 if (players == null) {
             System.out.println("No player data available for " + teamName);
             return;
         }
    	 
    	 System.out.println("\n" + teamName + " Player Details:\n");
    	 System.out.println("|-------------------- | --------------- | --------------- | --------------- | --------------- |");
    	 System.out.printf("|%-20s | %-15s | %-15s | %-15s | %-15s |%n",
    	            "Player Name", "Runs", "Wickets", "Average", "High Score");
    	    System.out.println("|-------------------- | --------------- | --------------- | --------------- | --------------- |");

    	    
    	    for (Player player : players) {
    	        System.out.printf("|%-20s | %-15d | %-15d | %-15.0f | %-15s |%n",
    	                player.getName(), player.getRuns(), player.getWickets(), player.getAverage(), player.getHs());
    	        System.out.println("|-------------------- | --------------- | --------------- | --------------- | --------------- |");
    	    }
    }
}
