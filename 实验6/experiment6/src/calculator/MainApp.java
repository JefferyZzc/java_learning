package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        CalcuUnit[] list ={new add(),new Sub(),new Mul(),new Div()};
        Scanner input =new Scanner(System.in);
        CalcuProxy proxy = new CalcuProxy();
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("D:\\大二上\\java\\实验6/log.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        proxy.setLogWriter(pw);

        while(true)
        {
            System.out.println("输入: ");
            String line=input.nextLine().trim();
            if(line.equals("exit"))
            {
                input.close();
                System.out.println("退出");
                break;
            }

            String[] s=line.split(" ");
            double x =Double.parseDouble(s[0]);
            double y=Double.parseDouble(s[2]);
            String operator =s[1];
            for(CalcuUnit cu:list)
            {
                proxy.setCalcUnit(cu);
                if(proxy.fit(operator))
                {
                    System.out.println("结果为: "+proxy.calc(x,y));
                    break;
                }
            }
            pw.flush();
        }
        pw.close();
        input.close();
    }
}
