/**
 * @author wangchong
 * @date 2019/6/8 21:24
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test_01 {
    public static void main(String[] args) {
        Integer a = 1;
        int b = 1;
        Integer c = Integer.valueOf(1);
        Integer d = new Integer(1);
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(b == d);
    }
}
