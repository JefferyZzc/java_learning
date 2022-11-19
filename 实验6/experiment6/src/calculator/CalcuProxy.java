package calculator;

import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.GregorianCalendar;

public class CalcuProxy implements InvocationHandler {

    CalcuUnit mycu;
    PrintWriter mypw;

    public Object setCalcUnit(CalcuUnit cu)
    {
        mycu = cu;
        return Proxy.newProxyInstance(cu.getClass().getClassLoader(), cu.getClass().getInterfaces(),this);
    }
    public void setLogWriter(PrintWriter pw) {
        mypw=pw;
    }
    public boolean fit(String operator)
    {
        boolean a = mycu.to_string().equals(operator);
        mypw.printf("[%s]",GregorianCalendar.getInstance().getTime().toString());
        mypw.printf("判断操作符%s是否符合当前计算单元：" + a,mycu.to_string());
        mypw.println();
        return a;
    }

    public double calc(double x,double y)
    {
        double a  = mycu.calc(x,y);
        mypw.printf("[%s]",GregorianCalendar.getInstance().getTime());
        mypw.printf("计算%.2f+%.2f的结果为：%.2f" ,x,y,a);
        mypw.println();
        return a;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志记录");
        method.invoke(mycu,args);
        return null;
    }
}
