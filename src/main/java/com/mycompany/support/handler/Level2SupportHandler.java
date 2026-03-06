package com.mycompany.support.handler;

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level2SupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Nivel 2 atendiendo solicitud INTERMEDIATE");
        } else {
            handleNext(request);
        }
    }
}
