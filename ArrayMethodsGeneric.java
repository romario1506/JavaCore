package lesson3.HW3;

public class ArrayMethodsGeneric <K> {
    K[] array;

    @SafeVarargs
    public ArrayMethodsGeneric(K...array) {
        this.array = array;
    }

    public void swapArrayElements(int firstElementIndex, int secondElementIndex) {
        try {
            K temporal = array[firstElementIndex];
            array[firstElementIndex] = array[secondElementIndex];
            array[secondElementIndex] = temporal;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Шеф, все пропало! Невозможно поменять местами элементы массива");
        }
    }

    public void printArray() {
        for (K element: array) {
            System.out.print(element.toString() + " ");
        }
        System.out.println();
    }
}
