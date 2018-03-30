/**
 * Created by Rukshar Alam on 3/29/2018.
 */
// node class is the basic structure
// of each node present in the huffman - tree.
class HuffmanNode {

    private int data;
    private  char c;

    private HuffmanNode left;
    private  HuffmanNode right;

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public HuffmanNode getLeft() {
        return left;
    }

    public void setLeft(HuffmanNode left) {
        this.left = left;
    }

    public HuffmanNode getRight() {
        return right;
    }

    public void setRight(HuffmanNode right) {
        this.right = right;
    }

    public void setData(int data){
        this.data = data;

    }
    public int getData(){
        return data;
    }




}