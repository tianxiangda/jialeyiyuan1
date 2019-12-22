import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class SortTest {

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
        //第二步使用key.toArray();将key转成对象数组
        Object[] obj =  key.toArray();
        //使用Arrays.copyof 复制数组 需要参数(需要被复制的数组,复制的长度,生成的类型.class)
        Integer[] arr = Arrays.copyOf(obj, obj.length, Integer[].class);
        //使用Arrays的排序
        Arrays.sort(arr);

        //foreach 排序好的数组 输出 mmp.get(i)
        for (int i : arr) {
            System.out.println(mmp.get(i));
        }


    }
}
