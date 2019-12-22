import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortTestNoUtil {

    public static void main(String[] args) {
        //模拟数据
        HashMap<Integer, String> mmp = new HashMap<>();
        for(int i=0;i<10;i++){

          int ran= (int) (i+Math.random()*300);
                mmp.put(ran,"嘉乐"+ran);
        }
        //第一步获取keySet集合
        Set<Integer> key = mmp.keySet();
//由于key是用Set集合装的，所以不会有重复
        System.out.println(key);
        //第二步创建一个数组用来装key

        int [] keys=new int [key.size()];
        //迭代keySet集合
        for (int i : key) {
            int b=0;
           //for循环数组
            for(int j=0;j<keys.length;j++){
                //判断数组中每一个值
                if(i>keys[j]){
                    //如果key的值比数组[j]的值大则调换
                    b=keys[j];
                    keys[j]=i;
                    if(j!=0){
                        keys[j-1]=b;
                    }
                }

            }

        }
        //排序后输出
        for (int i : keys) {
            System.out.println(mmp.get(i));
        }


    }
}
