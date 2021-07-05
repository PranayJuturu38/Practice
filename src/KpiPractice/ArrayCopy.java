package KpiPractice;

public class ArrayCopy {
    public static void copy(int[] array){
        int[] arr2 = new int[array.length];
        for(int i=0;i< array.length;i++){
            arr2[i]=array[i];
        }
        System.out.println("Array 2\t");
        for(int i=0;i<array.length;i++){
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args){
        int[] array ={1,2,3,5,61,634};
        System.out.println("Array 1 is\t");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }
        copy(array);
    }
}
