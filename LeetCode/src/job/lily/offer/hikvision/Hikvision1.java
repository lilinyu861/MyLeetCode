package job.lily.offer.hikvision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 输出两个数组相同的数字
 */
public class Hikvision1 {
    public static Set<Integer> findSameNum(Integer[] nums1, Integer[] nums2){
        Set<Integer> tempNums = new HashSet<>();
        Set<Integer> resNums = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            tempNums.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            if (!tempNums.add(nums2[i])){
                resNums.add(nums2[i]);
            }
        }
        return resNums;
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1,2,3,4};
        Integer[] nums2 = {2,3,4,6};
        Set<Integer> res = new HashSet<>();
        res = findSameNum(nums1, nums2);
        Iterator i = res.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
