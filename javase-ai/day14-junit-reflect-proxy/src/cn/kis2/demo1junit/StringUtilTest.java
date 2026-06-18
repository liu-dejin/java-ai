package cn.kis2.demo1junit;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    // 测试方法 public 无参 无返回值
    // 加上@Test注解
    @Test
    public void testPrintNumber() {
        // 测试步骤
        StringUtil.printNumber("kis2");
        // 测试用例
        StringUtil.printNumber(null);
        StringUtil.printNumber("");
    }

    @Test
    public void testGetMaxIndex() {
        int index1 = StringUtil.getMaxIndex("kis2");
        int index2 = StringUtil.getMaxIndex(null);
        int index3 = StringUtil.getMaxIndex("");

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        // 断言测试
        Assert.assertEquals( "最大索引有问题",3, index1);
        Assert.assertEquals("最大索引有问题",-1, index2);
        Assert.assertEquals("最大索引有问题",-1, index3);
    }
}
