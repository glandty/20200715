/**
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 *
 * 输入描述:
 * 一行一个由小写字母构成的字符串，字符串长度小于等于10。
 *
 *
 * 输出描述:
 * 输出答案(YES\NO).
 * 示例1
 * 输入
 * coco
 * 输出
 * YES
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            if(string.length() == 1) {
                System.out.println("YES");
                continue;
            }
            char[] ch = string.toCharArray();
            int i = 0;
            int j = ch.length-1;
            int count = 0;
            while(true) {
                if(count >= 2) {
                    System.out.println("NO");
                    break;
                }
                if(ch[i] != ch[j]) {
                    count++;
                    if(ch[i+1] == ch[j]) {
                        i++;
                    } else if(ch[i] == ch[j-1]) {
                        j--;
                    } else {
                        count++;
                    }
                    continue;
                }

                if(i >= j) {
                    System.out.println("YES");
                    break;
                }
                i++;
                j--;
            }
        }
    }
}
