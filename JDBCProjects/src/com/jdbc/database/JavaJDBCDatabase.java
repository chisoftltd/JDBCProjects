package com.jdbc.database;

import java.util.Scanner;

public class JavaJDBCDatabase {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "?XLq4K*Z(oyH";
	
	static ManipulateDatabase manipulateDatabase;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manipulateDatabase = new ManipulateDatabase(JDBC_DRIVER, DB_URL, USER, PASS);
		MainMenuMethod();
	}

	private static void MainMenuMethod() {
		// TODO Auto-generated method stub
		
		/*
		 * Main menu
		 */
		int reply = 0;
		Scanner input = null;
		System.out.println("1. Add Database. "); //-Lägga till i databasen
		System.out.println("2. Change Database. "); //- Ändra i databasen
		System.out.println("3. Remove Database. "); //-Ta bort från databasen
		System.out.println("4. Show Database. "); //-Visa data
		System.out.println("5. Add Tables. ");
		System.out.println("6. Add records to database. ");
		System.out.println("7. Change records in database. ");
		System.out.println("8. Search records. ");
		System.out.println("9. Exit. ");

		input = new Scanner(System.in);
		if (input.hasNextInt()) {
			reply = input.nextInt();
		}

		switch (reply) {
		case 1:
			manipulateDatabase.AddDatabase();
			break;
		case 2:
			manipulateDatabase.ChangeDatabase();
			break;
		case 3:
			manipulateDatabase.DropDatabase();
			break;
		case 4:
			manipulateDatabase.ShowDatabase();
			break;
		case 5:
			manipulateDatabase.CreateTables();
			break;
		case 6:
			manipulateDatabase.AddRecords();
			break;
		case 7:
			manipulateDatabase.ChangeRecords();
			break;
		case 8:
			manipulateDatabase.SearchDatabase();
			break;
		default:
			System.out.println("Goodbye!");
			System.exit(0);
		}
		input.reset();
		input.close();

	}

}
