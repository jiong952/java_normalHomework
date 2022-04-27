package NO17;

import java.io.*;
import java.util.Scanner;

public class Method_StringBuilder {
    //使用字符串StringBuilder删除，对原来的文件进行操作
    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要操作的文件路径及文件名:");
        String formPath = scanner.nextLine();
        System.out.println("请输入要删除的字符串:");
        String delete = scanner.nextLine();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(formPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = br.readLine()) != null){
                //一行行删除
                line = line.replace(delete,"");
                if(!line.equals("")){
                    sb.append(line);
                    //手动加入换行
                    sb.append("\r\n");
                }
            }
            System.out.println(sb.toString());
            BufferedWriter bw = new BufferedWriter(new FileWriter(formPath));
            bw.write(sb.toString());
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
