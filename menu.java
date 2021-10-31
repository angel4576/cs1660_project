import java.util.Scanner;

public class menu{

  public static void main(String[]args){
    System.out.println("Welcom to Big Data Processing Application");
    System.out.println("Please type the number that corresponds to which application you would like to run: ");
    System.out.println("1. Apache Hadoop");
    System.out.println("2. Apache Spark");
    System.out.println("3. Jupyter Notebook");
    System.out.println("4. SonarQube and SonarScanner");

    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    //System.out.println(input);
    if(input == 1){
      System.out.println("Apache Hadoop");
    }else if(input == 2){
      System.out.println("Apache Spark");
    }else if(input == 3){
      System.out.println("Jupyter Notebook");
    }else if(input == 4){
      System.out.println("SonarQube and SonarScanner");
    }else{
      System.out.println("Wrong number");
    }

  }

}
