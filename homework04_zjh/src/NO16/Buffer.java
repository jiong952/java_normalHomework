package NO16;

import java.io.*;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生成的文件路径及文件名:");
        String toPath = scanner.nextLine();
        //输入
        System.out.println("请输入内容（输入quit：退出）：");
//        InputStream in = System.in; //键盘输入字节流
//        InputStreamReader isr = new InputStreamReader(in); //桥梁，将字节流转换为字符流
//        BufferedReader br = new BufferedReader(isr); //缓冲输入流
        //精简版
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = null;

        try {
//            fw = new FileWriter(toPath);
//            bw = new BufferedWriter(fw);
            //精简
            bw = new BufferedWriter(new FileWriter(toPath));
            String line = null;
            while(!(line = br.readLine()).equals("quit")) {
                bw.write(line);
                System.out.println("输入了:"+line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
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
