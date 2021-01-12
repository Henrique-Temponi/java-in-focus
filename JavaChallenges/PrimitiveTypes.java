/**
 * Challenge
 * create a valid byte, short, int variable
 * create a long variable and make it 50k + 10 * the sum of byte,short,int
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        
        byte byteVar = 8;
        short shortVar = 2302;
        int intVar = 12301;

        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);

        System.out.println(longVar);
    }
}