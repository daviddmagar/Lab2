/**
 * CS 2003 - Lab 1
 * Code to place names in a 2d array where name be called by coordinate
 *
 * @author David Magar
 * @version 1.0
 * @since 09-05-2017
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatMap {

	int column = 0;
	int rows = -1;
	List<String> names = new ArrayList<String>();
	String inputName;



	public static void main(String args[]) {	
		int column = 0;
		int rows = -1;
		List<String> names = new ArrayList<String>();
		String inputName;
		String[][] names = new String[4][10]; 
		
		try {
			File inputFile = new File("src/names.dat");
			Scanner input = new Scanner(inputFile);
			
			while(input.hasNext()) {
					inputName = input.nextLine();
					
					if(column == 9) {
						column = 0;
						rows++;
						
					}	
					else {
						column++;
									
					}
					System.out.println(inputName);
					inputName = names[rows][column] ; 

			}
			input.close();
		} catch (IOException e) {
			System.err.println("IOException in reading input file!!!");	
		}
	
				
			
			
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the row:");
		int x = keyboard.nextInt();
		System.out.println("Please enter the column:");
		int y = keyboard.nextInt();
		String retName = names[x][y];
		System.out.println("The name in that location is: ");
		System.out.println(retName);
		
		
	}

}
