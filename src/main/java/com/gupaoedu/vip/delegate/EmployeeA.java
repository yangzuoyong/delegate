package com.gupaoedu.vip.delegate;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println(String.format("我是员工A，我现在开始做:%s工作", command));
    }
}
