package com.gupaoedu.vip.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {
    private Map<String, IEmployee> targers = new HashMap<>();

    public Leader() {
        targers.put("注册", new EmployeeA());
        targers.put("登录", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targers.get(command).doing(command);
    }
}
