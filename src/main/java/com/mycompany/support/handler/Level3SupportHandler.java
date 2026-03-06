package com.mycompany.support.handler;

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level3SupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Nivel 3 atendiendo solicitud CRITICAL");
        } else {
            handleNext(request);
        }
    }
}
