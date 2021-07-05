package KpiPractice;

public class Arrays {
    public static void printArray(double[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i] +"");
        }
    }
    public static double[] reverse(double[] array){
        double[] res = new double[array.length];
        int j = res.length-1;
        for(int i=0;i<array.length;i++) {
            res[j] = array[i];
            j--;
        }
        System.out.println("reversed array:\t");
        for (int k=0;k<res.length;k++){
            System.out.println(res[k]);
        }
        return res;
    }
    public static void main(String[] args){
        double[] arrList = {1,2,4,5,6,7,43,234};
        //printArray(new double[]{1,2,4,5,6,7,43,234});
        //        for(int i=0;i<arrList.length;i++){
//            System.out.println(arrList[i]+" ");
//        }
        reverse(arrList);
        double total =0;
        for(int i=0;i<arrList.length;i++){
            total = total+arrList[i];
        }
        System.out.println("Total is" +total);

        double max =arrList[0];
        for(int i=1;i<arrList.length;i++){
            if(arrList[i]>max){
                max = arrList[i];
            }

        }
        System.out.println("Max is"+max);
    }
}
