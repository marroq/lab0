import java.util.Arrays;

public class Zipper {

    // Deben asumir que first y second no son null
    public static int[] zipper(int[] first, int[] second) {
        // su codigo aqui
        return new int[1];
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static int[] str2Array(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        String[] strarr = s.split(",");
        int[] intarr = new int[strarr.length];
        for(int i=0; i < strarr.length; i++) {
            intarr[i] = Integer.parseInt(strarr[i]);
        }
        return intarr;
    }

    public static void main(String[] args) {
        if(args.length > 0) {
            int[] arr1 = str2Array(args[0]);
            int[] arr2 = str2Array(args[1]);
            int[] result = zipper(arr1, arr2);
            System.out.print("[");
            for(int i=0; i < result.length - 1; i++) {
                System.out.print(result[i]+", ");
            }
            System.out.println(result[result.length-1] + "]");
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
