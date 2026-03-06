package com.mycompany.support;

import com.mycompany.support.handler.Level1SupportHandler;
import com.mycompany.support.handler.Level2SupportHandler;
import com.mycompany.support.handler.Level3SupportHandler;
import com.mycompany.support.handler.SupportHandler;
import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Main {

    public static void main(String[] args) {
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Request r1 = new Request(Priority.BASIC);
        Request r2 = new Request(Priority.INTERMEDIATE);
        Request r3 = new Request(Priority.CRITICAL);

        level1.handleRequest(r1);
        level1.handleRequest(r2);
        level1.handleRequest(r3);
    }
}
