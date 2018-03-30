/**
 * Created by Rukshar Alam on 3/29/2018.
 */
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;



// comparator class helps to compare the node
// on the basis of one of its attribute.
// Here we will be compared
// on the basis of data values of the nodes.
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y)
    {

        return x.getData() - y.getData();
    }
}

public class Huffman {

    // main function
    public static void main(String[] args) throws  IOException
    {

        Scanner s = new Scanner(System.in);

        // number of characters.

        int n = 6;
        ReadFile rd = new ReadFile(n);
        rd.readFile();
        char[] charArray = rd.getCharArray();
        int[] charfreq = rd.getCharfreq();



        // creating a priority queue q.
        // makes a min-priority queue(min-heap).

        CreateNode cn = new CreateNode(n,charArray,charfreq);
        PriorityQueue<HuffmanNode> q = cn.populateMinQ();

        // create a root node
        HuffmanNode root = null;

        CreateTree ct = new CreateTree(q);
        root = ct.create();


        // print the codes by traversing the tree

        PrintCode pr = new PrintCode(root);
        //pr.printCode(root, "");
        pr.printMap();
    }
}