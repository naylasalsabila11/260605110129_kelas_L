public class TugasArray {
   public static void main(String[] args) {

      int sum = 1;

      for (int a = 1; a <= 2; a++ ) {
        System.out.println("Array" + a + ":");

        for (int i = 1; i <= 5; i++) {
            if (sum % 2 == 0) { 
               System.out.println(sum + ": Genap");
            }else{
               System.out.println(sum + ": Ganjil");
            }

              sum++;
          }
      }
   }
}