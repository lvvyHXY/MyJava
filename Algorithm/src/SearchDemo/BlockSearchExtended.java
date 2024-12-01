package SearchDemo;

public class BlockSearchExtended {
    public static void main(String[] args) {
        int[] arr = {27,22,30,40,36,13,19,16,20,7,10,43,50,48};
        Block1 b1 = new Block1(22,40,0,4);
        Block1 b2 = new Block1(13,20,5,8);
        Block1 b3 = new Block1(7,10,9,10);
        Block1 b4 = new Block1(43,50,11,13);
        Block1[] bs = {b1,b2,b3,b4};
        System.out.println(arr.length);
        System.out.println(whichIndex(arr,43,bs));
    }
    public static int whichIndex(int[] arr,int num,Block1[] blocks){
        int index = whichBlocks(num,blocks);
        if(index != -1) {
            for (int i = blocks[index].getStartIndex(); i <= blocks[index].getEndIndex(); i++) {
                if (num == arr[i])
                    return i;
            }
        }
        return -1;
    }
    public static int whichBlocks(int num,Block1[] blocks){
        for (int i = 0; i < blocks.length; i++) {
            if(num >= blocks[i].getMin() && num <= blocks[i].getMax())
                return i;
        }
        return -1;
    }
}
class Block1{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block1() {
    }

    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
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
        return "Block1{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
