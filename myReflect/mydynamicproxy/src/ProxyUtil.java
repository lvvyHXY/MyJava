import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {




    public static Star createProxy(BigStar bigStar){

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一：用于指定哪个类加载器，去加载生成代理类，写法比较固定，这个类.class.getClassLoader
                new Class[]{Star.class},//参数二，一个数组，指定接口，来决定生产的代理有哪些方法
                new InvocationHandler() {//参数三，指定代理对象要干啥
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //参数一：代理的对象，一般没啥用
                        //参数二：要调用的方法的对象
                        //参数三：调用的方法的形参
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        //去找明星sing或者dance
                        //调用大明星里的方法
                        return method.invoke(bigStar,args);
                    }
                }
        );


        return star;
    }
}
