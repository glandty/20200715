/**
 * 有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
 *
 * 给定一个二位数组arr及题目中的参数n，请返回结果数组。
 *
 * 测试样例：
 * [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
 * 返回：[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
 */
import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res = new int[n*n];
        int X = 0;
        int Y = n - 1;
        int index = 0;
        while(X < n) {
            int x = X;
            int y = Y;
            while(x < n && y < n) {
                res[index++] = arr[x++][y++];
            }
            if(Y > 0) {
                Y--;
            } else {
                X++;
            }
        }
        return res;
    }
}