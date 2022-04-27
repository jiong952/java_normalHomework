package NO17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method_List {
    //使用List<Character>，用户指定路径
    public static void main(String[] args){
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要操作的文件路径及文件名:");
        String formPath = scanner.nextLine();
        System.out.println("请输入要删除的字符串:");
        char[] deleteChar = scanner.nextLine().toCharArray();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(formPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            //使用StringBuilder一行行读入
            while ((line = br.readLine()) != null){
                if(!line.equals("")){
                    sb.append(line);
                    //手动加入换行
                    sb.append('\n');
                }
            }

            //StringBuilder转为List<Character>
            List<Character> list = new ArrayList<Character>();
            for (int i = 0; i < sb.length(); i++) {
                list.add(sb.charAt(i));
            }
            //使用list的方法删除
            for(int i = 0; i < list.size(); i++) {
                if (list.get(i) == deleteChar[0]) {
                    list.remove(i);
                    i--;
                }
            }
            //list转数组再遍历加入StringBuilder
            Object[] array = list.toArray();
            StringBuilder sb_new = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                    sb_new.append(array[i]);
            }
            System.out.println(sb_new.toString());
            //写回源文件
            BufferedWriter bw = new BufferedWriter(new FileWriter(formPath));
            bw.write(sb_new.toString());
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
