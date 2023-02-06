package src;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
  String userName;
  String pwd;


  public UserTest(String userName, String pwd) {
    this.userName = userName;
    this.pwd = pwd;

  }

  // create userName
  public static String createUserName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Create a username: ");
    return scanner.nextLine();
  }


  public static ArrayList<String> storeUsernamesInList() {
    ArrayList<String> usernameList = new ArrayList<>();
    while (true) {
      System.out.println("Would you like to add a username? (yes/no)");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      if (input.equals("no")) {
        break;
      }
      usernameList.add(createUserName());
    }
    System.out.println("The list of usernames is: " + usernameList);
    return usernameList;
  }

  @Override
  public String toString() {
    return "users: " + storeUsernamesInList();
  }
}