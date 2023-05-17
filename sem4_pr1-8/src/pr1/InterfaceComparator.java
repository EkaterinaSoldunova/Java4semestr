package pr1;

import java.util.Comparator;

public class InterfaceComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2){
        if (o1.length == o2.length) {
            return 0;
        }
        if (o1.length > o2.length) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {1,2,3,4,5,6,7,8};
        InterfaceComparator object = new InterfaceComparator();
        if (object.compare(arr1,arr2) == 0){
            System.out.println("Равны");
        }
        else if (object.compare(arr1,arr2) == 1){
            System.out.println("Первый массив больше, чем второй");
        }
        else {
            System.out.println("Первый массив меньше, чем второй");
        }
    }
}
