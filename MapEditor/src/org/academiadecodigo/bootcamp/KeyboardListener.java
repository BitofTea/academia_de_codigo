package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    private Cursor cursor;

    public KeyboardListener(Cursor cursor) {
        this.cursor = cursor;

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent event = new KeyboardEvent();

        event.setKey(KeyboardEvent.KEY_UP);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);

        event = new KeyboardEvent();

        event.setKey(KeyboardEvent.KEY_DOWN);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);

        event = new KeyboardEvent();

        event.setKey(KeyboardEvent.KEY_RIGHT);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);

        event = new KeyboardEvent();

        event.setKey(KeyboardEvent.KEY_LEFT);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);

        event = new KeyboardEvent();

        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;

            case KeyboardEvent.KEY_SPACE:
                cursor.paint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (!this.cursor.moves) return;


    }
}
