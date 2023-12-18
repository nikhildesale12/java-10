public class APITester {
   public static void main(String[] args) {
      String message = null;
      System.out.println(message.length());
   }   
}

Old Way: Compile and Run the program
$javac APITester.java
$java APITester

Output
Exception in thread "main" java.lang.NullPointerException
   at APITester.main(APITester.java:6)
   
   
New Way: Compile and Run the program with new Flag
$javac APITester.java
$java -XX:+ShowCodeDetailsInExceptionMessages APITester


Output
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
   at APITester.main(APITester.java:6)