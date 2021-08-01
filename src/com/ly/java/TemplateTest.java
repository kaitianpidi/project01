package com.ly.java;

import com.ly.Customer;
import com.sun.org.apache.bcel.internal.generic.DDIV;
import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;
import sun.security.provider.PolicySpiFile;
import sun.tracing.PrintStreamProviderFactory;

import javax.xml.bind.PrintConversionEvent;
import java.util.ArrayList;


/**
 * @author: ly
 * @date:2021/8/1 - 15:01
 */

public class TemplateTest {
    //模板六： prsf：     可生成 private static final
    private static final Customer CUSTOMER= new Customer();
    //变形： psf
    public static final  Integer NUM=1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION="china";
    /**
    * 客户名称
    */
    private String name ;


    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(345);
        list1.add(1523);

        for (int i = 0; i < list1.size(); i++) {

        }
        for (int i = list1.size() - 1; i >= 0; i--) {

        }
        if (list1 == null) {

        }
        if (list1 != null) {

        }
        if (list1 != null) {

        }
        if (list1 == null) {

        }

        //模板：
        //1. psvm
        //2. sout soutv soutm soutp
        //6.prsf     可生成 private static final

        //  psf       可生成 public static final
    }
}
