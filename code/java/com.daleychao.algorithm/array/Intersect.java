package com.daleychao.algorithm.array;

import java.util.*;

/**
 * 两个数组的交集 II
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * @author Daniel
 */
public class Intersect {
    public static void main(String[] args) {
        for (int a : intersect(new int[]{4, 9, 5
        }, new int[]{9, 4, 9, 8, 4})
        ) {
            System.out.println(a);
        }

    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] > nums1[i]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] res = new int[temp.size()];
        for (int m = 0; m < res.length; m++) {
            res[m] = temp.get(m);
        }
        return res;
    }
}
