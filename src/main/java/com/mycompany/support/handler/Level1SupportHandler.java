package com.mycompany.support.handler;

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level1SupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Nivel 1 atendiendo solicitud BASIC");
        } else {
            handleNext(request);
        }
    }
}
