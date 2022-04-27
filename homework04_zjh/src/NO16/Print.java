package NO16;

import java.io.*;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生成的文件路径及文件名:");
        String toPath = scanner.nextLine();
        //输入
        System.out.println("请输入内容（输入quit：退出）：");
        //精简版
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //try resource自动关闭流
        try (PrintWriter pw = new PrintWriter(new FileWriter(toPath))) {
            String line = null;
            //读到quit就退出
            while (!(line = br.readLine()).equals("quit")) {
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
