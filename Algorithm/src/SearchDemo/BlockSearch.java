package SearchDemo;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21,18,
                32,23,37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //18个 所以大致分为sqrt(18) 约为4.24
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);
        Block[] blocks = {b1,b2,b3};
        int num = 66;
        int index = whichIndex(arr, num, blocks);
        System.out.println(index);
    }
    public static int whichIndex(int[] arr,int num,Block[] blocks){
        int indexBlock = getWhichBlock(num,blocks);
        if(indexBlock != -1){
            for (int i = blocks[indexBlock].getStartIndex(); i <= blocks[indexBlock].getEndIndex(); i++) {
                if(num == arr[i])
                    return i;
            }
        }
        return -1;
    }
    public static int getWhichBlock(int num,Block[] blocks){
        for (int i = 0; i < blocks.length; i++) {
            if(num <= blocks[i].getMax())
                return i;
        }
        return -1;
    }
}

class Block{
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
