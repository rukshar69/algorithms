import java.util.PriorityQueue;

/**
 * Created by Rukshar Alam on 3/30/2018.
 */
public class CreateTree {
    private  HuffmanNode root;
    private PriorityQueue<HuffmanNode> q;

    public CreateTree(PriorityQueue<HuffmanNode> q){
        this.q =q;
    }

    public HuffmanNode create(){
        // Here we will extract the two minimum value
        // from the heap each time until
        // its size reduces to 1, extract until
        // all the nodes are extracted.
        root = null;
        while (q.size() > 1) {

            // new node f which is equal
            HuffmanNode f = new HuffmanNode();

            // first min extract.
            HuffmanNode x = q.peek();
            q.poll();

            // second min extarct.
            HuffmanNode y = q.peek();
            q.poll();

            int newData = x.getData() + y.getData();

            // to the sum of the frequency of the two nodes
            // assigning values to the f node.
            f.setData(newData );
            f.setC( '-');

            // first extracted node as left child.
            f.setLeft(x);

            // second extracted node as the right child.
            f.setRight(y);

            // marking the f node as the root node.
            root = f;

            // add this node to the priority-queue.
            q.add(f);
        }

        return root;
    }
}
