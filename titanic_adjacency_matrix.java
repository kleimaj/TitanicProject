import java.util.*;
import java.io.*;

public class titanic_adjacency_matrix {
  public static void main(String[] args) {
  Scanner scanner;
  File file;
try {
  if (args.length > 0) {
    file = new File(args[0]);
  }
  else {
      System.out.println("Enter name of file to be parsed");
      scanner = new Scanner(System.in);
      file = new File(scanner.nextLine());
      scanner.close();
      scanner = new Scanner(file);
  }
   scanner = new Scanner(file);
   ArrayList<String> entries = new ArrayList<String>();
   while(scanner.hasNext()) {
     entries.add(scanner.nextLine());
   }
    scanner.close();
    System.out.println(entries.get(0));
    for (int i = 0; i < entries.size(); i++) {
      String name = entries.get(i).substring(0,entries.get(i).indexOf(','));
      for (int j = i+1; j < entries.size(); j++) {
        String name2 = entries.get(j).substring(0,entries.get(j).indexOf(','));
        if (name.equals(name2)) {
          System.out.println(entries.get(i)+ "\t" + entries.get(j));
        }

      }
    }
  }
  catch (FileNotFoundException ex) {
      System.out.println("File Not Found Exception");
  }
}
}
