/**
 * @author wangchong
 * @date 2019/6/8 19:45
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class 百万富翁问题 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += Math.pow(2,i);
        }
        System.out.println((30 * 10) + " " + sum);
    }
}
