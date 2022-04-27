package NO18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//统计字符数、单词数、行数
public class Count {
    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要操作的文件路径及文件名:");
        String formPath = scanner.nextLine();
        //统计量
        int countChar = 0;
        int countWord = 0;
        int countLine = 0;
        countChar = getCharNum(formPath);
        countWord = getWordNum(formPath);
        countLine = getLineNum(formPath);
        System.out.println("字符数：" + countChar);
        System.out.println("单词数：" + countWord);
        System.out.println("行数：" + countLine);
    }
    //统计字符
    public static int getCharNum(String formPath){
        int count = 0;
        try {
            BufferedReader br  = new BufferedReader(new FileReader(formPath));
            char[] ch = new char[1000];
            int len = 0;
            while ((len = br.read(ch)) != -1) {
            }
            for (int i = 0; i < ch.length; i++) {
                //去除掉\r \n
                char c = ch[i];
                if(c != '\r' && c != '\n'&& c != ' ' && c != 0){
                    count++;
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
    //统计单词
    public static int getWordNum(String formPath){
        int count = 0;
        try {
            BufferedReader br  = new BufferedReader(new FileReader(formPath));
            String line = null;
            ArrayList array = new ArrayList();
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[(\\u4e00-\\u9fa5)]", "");// 去除汉字
                line = line.replaceAll(",", " "); // ， 转化为空格
                String[] strings = line.split("\\s+");
                array.add(strings);
            }
            br.close();
            // 正则判断每个数组中是否存在有效单词(存在字母)
            String regex = ".*[a-zA-Z]+.*";
            Pattern p = Pattern.compile(regex);
            Iterator it = array.iterator();
            while (it.hasNext()) {
                String[] string = (String[]) it.next();
                for (int i = 0; i <= string.length - 1; i++) {
                    Matcher m = p.matcher(string[i]);
                    if (m.matches()) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
    //统计行数
    public static int getLineNum(String formPath){
        int count = 0;
        try {
            BufferedReader br  = new BufferedReader(new FileReader(formPath));
            String line = null;
            while ((line = br.readLine()) != null) {
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
