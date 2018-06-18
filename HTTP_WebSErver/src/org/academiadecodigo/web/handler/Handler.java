package org.academiadecodigo.web.handler;

import org.academiadecodigo.web.util.Request;

import java.io.OutputStream;

public interface Handler {

    void handle(Request request, OutputStream outputStream);
}
