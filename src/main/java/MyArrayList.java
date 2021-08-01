import java.util.Arrays;

public class MyArrayList<E> {
    private final int DEFAULT_SIZE=10;
    private Object[] myData = new Object[DEFAULT_SIZE];
    private int actSize=0;

    public boolean add(E data){
        if (actSize>=myData.length/2){
            increaseSize();
        }
        myData[actSize++] = data;
        return true;
    }

    private void increaseSize()throws RuntimeException{
        myData = Arrays.copyOf(myData, myData.length*2);
    }

    public E get(int index) throws RuntimeException{
        if (index >= actSize){
            throw new IndexOutOfBoundsException();
        }
        return (E) myData[index];
    }

    public static void main(String[] args) {
        MyArrayList<String> arList = new MyArrayList<String>();
        arList.add("Hello");
        arList.add("It's worked");
        System.out.println(arList.get(0));
        System.out.println(arList.get(1));

    }
}
