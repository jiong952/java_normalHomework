package extra;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//统计单词并且画图
public class CountAndPic {
    ChartPanel frame1;
    public CountAndPic(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart3D(
                "文本各字母统计图", // 图表标题
                "字母", // 目录轴的显示标签
                "数目", // 数值轴的显示标签
                dataset, // 数据集
                PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                true,           // 是否显示图例(对于简单的柱状图必须是false)
                false,          // 是否生成工具
                false           // 是否生成URL链接
        );

        //从这里开始
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
        domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题
        domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题
        ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
        rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
        chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体
        frame1=new ChartPanel(chart,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
    }

    public static void main(String[] args) {
        //用户指定路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要操作的文件路径及文件名:");
        String formPath = scanner.nextLine();
        TreeMap<Character, Integer> map = getNum(formPath);
        System.out.println(map);
        CategoryDataset dataSet = getDataSet(map);
        JFrame frame=new JFrame("统计文本字母数");
        frame.setLayout(new GridLayout(1,1,10,10));
        frame.add(new CountAndPic(dataSet).getChartPanel());   //添加柱形图
        frame.setBounds(0, 0, 900, 500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
    public static TreeMap<Character,Integer> getNum(String formPath){
        TreeMap<Character,Integer> map  = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br  = new BufferedReader(new FileReader(formPath));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            String str = sb.toString();
            char[] charArray = str.toCharArray();
            //遍历字符串数组中每个字符
            for (int i = 0; i < charArray.length; i++) {
                //不为空格且第一次遇到
                if(!map.containsKey(charArray[i]) && charArray[i] != ' '){
                    map.put(charArray[i],1);
                }else if(map.containsKey(charArray[i])){
                    map.put(charArray[i],map.get(charArray[i])+1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
    private static CategoryDataset getDataSet(TreeMap<Character, Integer> map) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //将数据放入dataset
        for (Character key : map.keySet()) {
            dataset.addValue(map.get(key),key,key);
        }
        return dataset;
    }
    public ChartPanel getChartPanel(){
        return frame1;
    }
}