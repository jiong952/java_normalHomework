package NO15;

import java.io.*;
import java.util.Scanner;

public class Copy_ByteStream {
    public static void main(String[] args) {
        //输入输出流对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要复制的文件路径及文件名:");
        String fromPath = scanner.nextLine();
        File fromFile = new File(fromPath);
        System.out.println("请输入复制后的文件路径及文件名:");
        String toPath = scanner.nextLine();
        File toFile = new File(toPath);

        try {
            fis = new FileInputStream(fromFile);
            fos = new FileOutputStream(toFile);
            //将字节流整合成字节数组写入
            byte[] bytes = new byte[1024 * 1024];
            int end =-1;
            while ((end = fis.read(bytes)) != -1) {
                fos.write(bytes,0,end);
            }
            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭字节流 先关输入再关输出
            if (fis != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
