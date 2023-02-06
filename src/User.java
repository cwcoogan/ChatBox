package src;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
  String userName;
  String pwd;


  public User(String userName, String pwd) {
    this.userName = userName;
    this.pwd = pwd;

  }

  // create userName
  public static String createUserName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Create a username: ");
    return scanner.nextLine();
  }


  // create ArrayList for userNames
  public static ArrayList<String> storeUsernamesInList() {
    ArrayList<String> usernameList = new ArrayList<>();
    System.out.println("Welcome. Enter your username: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    System.out.println("Error. user not found.");
    System.out.println("Create new user?: ");
    Scanner scan2 = new Scanner(System.in);
    String input2 = scan.nextLine();
    if (input2 == "yes") {
      System.out.println("Enter new username: ");
      Scanner scan3 = new Scanner(System.in);
      String input3 = scan.nextLine();
    }
    usernameList.add(createUserName());
    return usernameList;
  }


    // to see the string representation.
    @Override
    public String toString() {
      return "users: " + storeUsernamesInList();
    }
  }
