package NO15;

import java.io.*;
import java.util.Scanner;

public class Copy_CharStream {
    public static void main(String[] args) {
        //字符输入输出流对象
        FileReader fr = null;
        FileWriter fw = null;
        //缓冲输入和输出流对象
        BufferedReader br = null;
        BufferedWriter bw = null;
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要复制的文件路径及文件名:");
        String fromPath = scanner.nextLine();
        System.out.println("请输入复制后的文件路径及文件名:");
        String toPath = scanner.nextLine();

        try {
            fr = new FileReader(fromPath);
            fw = new FileWriter(toPath);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String line;
            while ((line = br.readLine()) != null){
                bw.write(line);
                //移动bw输出流
                bw.newLine();
            }
            //刷新输出流缓冲
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流 关闭装饰流就可以把原生流一起关闭
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
