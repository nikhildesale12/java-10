public class APITester {
   public static void main(String[] args) {
      String message = "DEMO";
      Object obj = message;
      // Old way of getting length
      if(obj instanceof String){
         String value = (String)obj;
         System.out.println(value.length());
      }
      // New way of getting length
      if(obj instanceof String value){
         System.out.println(value.length());
      }
   }
}