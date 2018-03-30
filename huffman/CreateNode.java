import java.util.PriorityQueue;

/**
 * Created by Rukshar Alam on 3/30/2018.
 */
public class CreateNode {


    // creating a priority queue q.
    // makes a min-priority queue(min-heap).
    private int n;
    private PriorityQueue<HuffmanNode> q;
    private char[] charArray;
    private  int[] charfreq ;
    public CreateNode(int n, char[] charArray, int[] charfreq){
        this.n = n;
        this.charArray = charArray;
        this.charfreq = charfreq;
    }

    private HuffmanNode setData(HuffmanNode hn, int i){
        hn.setC(charArray[i]);
        hn.setData(charfreq[i]);

        return hn;
    }

    private HuffmanNode setChild(HuffmanNode hn){
        hn.setLeft( null);
        hn.setRight(null);

        return hn;
    }

    public PriorityQueue<HuffmanNode> populateMinQ(){
        q = new PriorityQueue<HuffmanNode>(n, new MyComparator());
        for (int i = 0; i < n; i++) {

            // creating a huffman node object
            // and adding it to the priority-queue.
            HuffmanNode hn = new HuffmanNode();
            setData(hn,i);

            setChild(hn);


            // add functions adds
            // the huffman node to the queue.
            q.add(hn);
        }

        return q;

    }
}
