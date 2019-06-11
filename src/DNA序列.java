import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/8 19:59
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe 多层循环递减的改成成只要一趟 减小了时间复杂度
 */
public class DNA序列 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();
        int n = input.nextInt();
        int ntem = n;
        int i = 0;
        String res = null;
        int maxNum = 0;
            int cnum = 0;
            for (int j = 0; j < dna.length() - n + 1; j++) {
                for (int k = j; k < j + n; k++) {
                    if (dna.charAt(k) == 'C' || dna.charAt(k) == 'G') {
                        cnum++;
                    }
                }
                    if (cnum > maxNum) {
                        maxNum = cnum;
                        res = dna.substring(j,j + ntem);
                    }
                    cnum = 0;


            }
        System.out.println(res);
    }
}
