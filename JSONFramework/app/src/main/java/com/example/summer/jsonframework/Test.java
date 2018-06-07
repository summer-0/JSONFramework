package com.example.summer.jsonframework;

/**  泛型：
 *    extends get() 用于限制返回值的
 *    super   set() 用于参数类型的限定
 */

public class Test {
    public void test(){
       /* Box<Number> box = new Box<>();
        //box = new Box<Integer>(); //错误的

        box.setData(new Integer(1));
        box.setData(new Float(2f));*/



      /* Box<? extends Number> box = new Box<>();  //上限
       box = new Box<Integer>();*/


      //Box<? super Number> box = new Box<Object>(); //下限

        Box<? super Number> box = new Box<>();
        box.setData(new Integer(2));
    }

    /**
     *   48:22
     */
}
