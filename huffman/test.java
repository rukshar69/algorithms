import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rukshar Alam on 3/29/2018.
 */
public class test {

    public static void printArray(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\Rukshar Alam\\Documents\\Algo\\src\\input.txt";
        int n = 6;
        char[] charArray = new char[n];
        int[] charfreq = new int[n];
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                //System.out.println(line);
                charArray[index] = line.charAt(0);
                charfreq[index]= Integer.valueOf(line.substring(2));
                index++;
            }
        }

        for(int i =0;i<n;i++){
            System.out.print(charArray[i]+" ");
        }
        System.out.println();
        printArray(charfreq, n);



    }
}
