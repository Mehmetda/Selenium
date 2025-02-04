package Assertions;

import org.junit.Assert;
import org.junit.Test;

public class C01_Assertions {
 int alininyaşı=34;
 int tetonunyaşı=78;
 int emeklilikyaşı=65;

 @Test
    public void test1(){

Assert.assertTrue(tetonunyaşı>emeklilikyaşı);



 }
    @Test
    public void test2(){



        Assert.assertFalse(alininyaşı>emeklilikyaşı);



    }
    @Test
    public void test3(){



        Assert.assertEquals(65,emeklilikyaşı);


    }



}
