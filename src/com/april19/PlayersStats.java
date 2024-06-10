package com.april19;

import java.util.ArrayList;

public class PlayersStats {

	public static ArrayList<Player>m1() {

		ArrayList<Player> MI = new ArrayList<Player>();

		MI.add(new Player("Rohit Sharma", 6529, 15, 30.08f, "109", "4/6"));
		MI.add(new Player("Lendl Simmons", 1049, 1, 39.96f, "100", "1/34"));
		MI.add(new Player("Surya Kumar Yadav", 3379, 0, 31.88f, "103", "0/8"));
		MI.add(new Player("Ambati Rayudu", 3916, 0, 28.2f, "100*", "-"));
		MI.add(new Player("Tilak Verma", 948, 0, 39.5f, "84", "0/6"));
		MI.add(new Player("Kieron Pollard", 3412, 69, 28.67f, "87", "4/44"));
		MI.add(new Player("Harbhajan Singh", 833, 150, 15.15f, "64", "5/18"));
		MI.add(new Player("Mitchell McClenaghan", 85, 71, 6.54f, "20", "4/21"));
		MI.add(new Player("Lasith Malinga", 88, 170, 5.5f, "17", "5/13"));
		MI.add(new Player("Jasprit Bumrah", 66, 155, 9.29f, "16", "5/10"));
		MI.add(new Player("Zaheer Khan", 117, 102, 8.36f, "23", "4/19"));
		return MI;
	}

	public static ArrayList<Player> m2() {

		ArrayList<Player> CSK = new ArrayList<Player>();

		CSK.add(new Player("MS Dhoni", 20408, 22, 40.16f, "123*", "-"));
		CSK.add(new Player("Suresh Raina", 19416, 1, 32.77f, "100*", "1/6"));
		CSK.add(new Player("Ravindra Jadeja", 14536, 122, 31.66f, "51*", "5/16"));
		CSK.add(new Player("Dwayne Bravo", 6237, 92, 24.74f, "68*", "4/22"));
		CSK.add(new Player("Faf du Plessis", 2926, 0, 31.38f, "96", "0/6"));
		CSK.add(new Player("Deepak Chahar", 1917, 71, 8.93f, "20*", "5/12"));
		CSK.add(new Player("Imran Tahir", 1629, 82, 9.5f, "15", "4/12"));
		CSK.add(new Player("Shardul Thakur", 441, 55, 12.25f, "15", "2/18"));
		CSK.add(new Player("Moeen Ali", 132, 11, 11.0f, "36", "0/6"));
		CSK.add(new Player("Ruturaj Gaikwad", 377, 0, 22.17f, "64", "0/2"));
		CSK.add(new Player("Robin Uthappa", 2914, 0, 26.49f, "87", "0/2"));
		return CSK;
	}

	public static ArrayList<Player> m3() {

		ArrayList<Player> RCB = new ArrayList<Player>();

		RCB.add(new Player("Virat Kohli", 6234, 12, 38.34f, "113", "3/10"));
		RCB.add(new Player("AB de Villiers", 4849, 0, 40.77f, "133*", "1/14"));
		RCB.add(new Player("Glenn Maxwell", 2839, 20, 22.94f, "78", "3/15"));
		RCB.add(new Player("Devdutt Padikkal", 1873, 0, 31.21f, "101*", "-"));
		RCB.add(new Player("Yuzvendra Chahal", 125, 133, 7.48f, "22", "4/16"));
		RCB.add(new Player("Harshal Patel", 286, 70, 11.44f, "36*", "3/21"));
		RCB.add(new Player("Mohammed Siraj", 227, 63, 9.92f, "15", "4/32"));
		RCB.add(new Player("Kyle Jamieson", 110, 19, 15.71f, "16", "1/16"));
		RCB.add(new Player("Navdeep Saini", 78, 23, 8.66f, "10", "2/12"));
		RCB.add(new Player("Washington Sundar", 368, 28, 17.52f, "50", "1/12"));
		RCB.add(new Player("KS Bharat", 113, 0, 18.83f, "32", "-"));
		return RCB;
	}

	public static ArrayList<Player> m4() {

		ArrayList<Player> KKR = new ArrayList<Player>();

		KKR.add(new Player("Shubman Gill", 1441, 0, 33.05f, "76*", "-"));
		KKR.add(new Player("Andre Russell", 5106, 69, 29.36f, "88*", "4/20"));
		KKR.add(new Player("Eoin Morgan", 3461, 0, 29.56f, "91", "0/3"));
		KKR.add(new Player("Pat Cummins", 377, 57, 14.07f, "66*", "3/9"));
		KKR.add(new Player("Sunil Narine", 985, 130, 17.67f, "34", "3/29"));
		KKR.add(new Player("Varun Chakravarthy", 105, 33, 10.5f, "12", "1/16"));
		KKR.add(new Player("Harbhajan Singh", 110, 64, 10.0f, "14", "2/15"));
		KKR.add(new Player("Shakib Al Hasan", 1539, 64, 23.15f, "66*", "1/17"));
		KKR.add(new Player("Rahul Tripathi", 1374, 0, 27.48f, "93", "0/1"));
		KKR.add(new Player("Dinesh Karthik", 3888, 0, 26.13f, "97*", "0/3"));
		KKR.add(new Player("Lockie Ferguson", 84, 24, 14.0f, "24", "3/15"));
		return KKR;
	}

	public static ArrayList <Player>m5() {

		ArrayList<Player> RR = new ArrayList<Player>();

		RR.add(new Player("Sanju Samson", 2828, 0, 27.01f, "119*", "-"));
		RR.add(new Player("Jos Buttler", 2050, 0, 35.17f, "124", "0/4"));
		RR.add(new Player("Riyan Parag", 446, 0, 18.58f, "48", "0/0"));
		RR.add(new Player("Chris Morris", 515, 26, 23.41f, "36*", "1/9"));
		RR.add(new Player("Yashasvi Jaiswal", 226, 0, 14.12f, "49", "0/0"));
		RR.add(new Player("Shreyas Gopal", 312, 31, 14.18f, "19", "2/21"));
		RR.add(new Player("Jaydev Unadkat", 361, 85, 8.39f, "24*", "4/15"));
		RR.add(new Player("Kartik Tyagi", 3, 4, 3.0f, "3", "0/1"));
		RR.add(new Player("Mustafizur Rahman", 124, 34, 4.94f, "16", "3/22"));
		RR.add(new Player("David Miller", 1850, 0, 32.96f, "101*", "0/0"));
		RR.add(new Player("Liam Livingstone", 231, 4, 20.18f, "44", "0/0"));
		return RR;
	}

	public static ArrayList <Player>m6() {

		ArrayList<Player> PBKS = new ArrayList<Player>();

		PBKS.add(new Player("KL Rahul", 3063, 0, 45.5f, "132*", "-"));
		PBKS.add(new Player("Mayank Agarwal", 1842, 0, 22.82f, "106*", "0/1"));
		PBKS.add(new Player("Chris Gayle", 4965, 4, 41.13f, "175*", "18/1"));
		PBKS.add(new Player("Nicholas Pooran", 1118, 0, 28.76f, "89*", "-"));
		PBKS.add(new Player("Deepak Hooda", 821, 27, 22.25f, "62*", "1/9"));
		PBKS.add(new Player("Shahrukh Khan", 258, 0, 18.42f, "40", "0/0"));
		PBKS.add(new Player("Ravi Bishnoi", 13, 22, 13.0f, "9", "1/19"));
		PBKS.add(new Player("Mohammed Shami", 58, 57, 8.2f, "13", "2/21"));
		PBKS.add(new Player("Arshdeep Singh", 16, 31, 8.0f, "10", "2/24"));
		PBKS.add(new Player("Jhye Richardson", 9, 7, 4.5f, "6", "1/17"));
		PBKS.add(new Player("Nathan Ellis", 1, 2, 1.0f, "1", "0/10"));
		return PBKS;
	}

	public static ArrayList<Player> m7() {

		ArrayList<Player> DC = new ArrayList<Player>();

		DC.add(new Player("Rishabh Pant", 1988, 0, 38.27f, "128*", "-"));
		DC.add(new Player("Shreyas Iyer", 2282, 0, 31.88f, "96*", "-"));
		DC.add(new Player("Prithvi Shaw", 1494, 0, 27.16f, "99", "0/1"));
		DC.add(new Player("Kagiso Rabada", 16, 70, 5.33f, "7", "4/21"));
		DC.add(new Player("Axar Patel", 735, 44, 18.07f, "44*", "2/9"));
		DC.add(new Player("Avesh Khan", 28, 44, 3.5f, "5", "2/15"));
		DC.add(new Player("Ravichandran Ashwin", 465, 62, 10.79f, "34*", "4/15"));
		DC.add(new Player("Marcus Stoinis", 1074, 23, 25.57f, "53", "2/8"));
		DC.add(new Player("Chris Woakes", 190, 26, 16.66f, "23*", "3/18"));
		DC.add(new Player("Ishant Sharma", 62, 39, 6.89f, "10", "2/34"));
		DC.add(new Player("Shimron Hetmyer", 942, 0, 27.7f, "45", "0/5"));
		return DC;
	}

	public static ArrayList <Player>m8() {

		ArrayList<Player> GT = new ArrayList<Player>();

		GT.add(new Player("Hardik Pandya", 1544, 42, 29.69f, "60*", "0/1"));
		GT.add(new Player("Shubman Gill", 1441, 0, 33.05f, "76*", "-"));
		GT.add(new Player("Ravindra Jadeja", 3592, 127, 29.58f, "62*", "4/17"));
		GT.add(new Player("Shreyas Iyer", 2521, 0, 31.51f, "96*", "-"));
		GT.add(new Player("Prithvi Shaw", 1286, 0, 28.57f, "82*", "0/4"));
		GT.add(new Player("Trent Boult", 148, 75, 9.25f, "13", "3/17"));
		GT.add(new Player("Rahul Chahar", 46, 26, 9.2f, "7", "1/7"));
		GT.add(new Player("Rashid Khan", 135, 83, 4.67f, "7", "2/18"));
		GT.add(new Player("Shardul Thakur", 153, 46, 10.2f, "17*", "3/24"));
		GT.add(new Player("Dinesh Karthik", 3949, 0, 27.67f, "97*", "0/3"));
		GT.add(new Player("Wriddhiman Saha", 2145, 0, 25.79f, "115", "0/1"));
		return GT;
	}

	public static ArrayList <Player>m9() {

		ArrayList<Player> LSG = new ArrayList<Player>();

		LSG.add(new Player("KL Rahul", 3063, 0, 45.5f, "132*", "-"));
		LSG.add(new Player("Marcus Stoinis", 2003, 61, 28.2f, "87", "1/8"));
		LSG.add(new Player("Jonny Bairstow", 1147, 0, 27.3f, "61", "0/3"));
		LSG.add(new Player("Rashid Khan", 189, 99, 8.04f, "7", "4/14"));
		LSG.add(new Player("Mohammed Shami", 96, 70, 6.85f, "12", "4/14"));
		LSG.add(new Player("Kagiso Rabada", 32, 58, 5.33f, "9", "3/23"));
		LSG.add(new Player("Shreyas Iyer", 2831, 0, 31.88f, "96*", "-"));
		LSG.add(new Player("Shikhar Dhawan", 5806, 0, 34.54f, "106*", "0/0"));
		LSG.add(new Player("Ravichandran Ashwin", 640, 71, 13.91f, "32", "3/24"));
		LSG.add(new Player("Ishan Kishan", 1162, 0, 26.41f, "99", "0/6"));
		LSG.add(new Player("Moeen Ali", 1995, 54, 26.02f, "66", "2/18"));
		return LSG;
	}

    public static ArrayList <Player>m10() {
        	  
       ArrayList<Player>SRH = new ArrayList<Player>();
       
       SRH.add(new Player("Kane Williamson", 2271, 0, 40.2f, "89", "0/0"));
       SRH.add(new Player("David Warner", 5447, 4, 41.59f, "126", "4/21"));
       SRH.add(new Player("Jonny Bairstow", 1292, 0, 41.61f, "114", "0/0"));
       SRH.add(new Player("Rashid Khan", 741, 85, 11.55f, "52*", "2/7"));
       SRH.add(new Player("Bhuvneshwar Kumar", 154, 159, 4.95f, "15*", "5/19"));
       SRH.add(new Player("Jason Holder", 533, 33, 18.37f, "47", "0/9"));
       SRH.add(new Player("Wriddhiman Saha", 2197, 0, 25.68f, "87", "0/1"));
       SRH.add(new Player("Abdul Samad", 297, 6, 19.8f, "33*", "0/3"));
       SRH.add(new Player("T Natarajan", 18, 48, 3.6f, "4*", "3/15"));
       SRH.add(new Player("Jason Roy", 334, 0, 26.0f, "60", "0/1"));
       SRH.add(new Player("Manish Pandey", 3241, 0, 29.1f, "83*", "0/1"));
       return SRH;
    }
}
