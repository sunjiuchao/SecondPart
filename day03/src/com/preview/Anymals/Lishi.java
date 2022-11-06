package com.preview.Anymals;

public class Lishi extends Pople{
    @Override
    public void work() {
        System.out.println("工作");
    }


    /**
     * 传递参数为接口，实现接口中继承的方法
     * @param kunkunaction
     */
    public void ikunAction(Kunkunaction kunkunaction){
        kunkunaction.sing();
        kunkunaction.dance();
        kunkunaction.rap();
    }
}
