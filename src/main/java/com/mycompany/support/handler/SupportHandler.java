package com.mycompany.support.handler;

import com.mycompany.support.model.Request;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void handleNext(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No existe un nivel de soporte disponible para la prioridad: "
                    + request.getPriority());
        }
    }

    public abstract void handleRequest(Request request);
}
