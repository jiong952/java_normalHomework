package NO17;

import java.io.*;
import java.util.Scanner;

public class Method_String {
    //使用字符串删除,使用临时文件
    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要操作的文件路径及文件名:");
        String formPath = scanner.nextLine();
        System.out.println("请输入要删除的字符串:");
        String delete = scanner.nextLine();

        //旧文件
        File old_file = new File(formPath);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(old_file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //删除后的文件，创建一个临时文件
        File newFile = null;
        try {
            newFile = File.createTempFile("file", ".txt", old_file.getParentFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(newFile));
            while ((line = br.readLine()) != null){
                //一行行删除
                line = line.replace(delete,"");
                pw.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();
            //删除原来的文件，将临时文件命名为原来的
            old_file.delete();
            newFile.renameTo(old_file);
        }
    }
}
