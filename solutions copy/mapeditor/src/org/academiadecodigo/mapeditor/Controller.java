package org.academiadecodigo.mapeditor;

import org.academiadecodigo.mapeditor.cursor.Direction;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {

    private Keyboard keyboard;
    private MapEditor mapEditor;

    public Controller(MapEditor mapEditor) {
        this.mapEditor = mapEditor;

        this.keyboard = new Keyboard(this);
        registerKeyboardEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        registerKeyboardEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        registerKeyboardEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        registerKeyboardEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        registerKeyboardEvent(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);

        registerKeyboardEvent(KeyboardEvent.KEY_S, KeyboardEventType.KEY_PRESSED);
        registerKeyboardEvent(KeyboardEvent.KEY_L, KeyboardEventType.KEY_PRESSED);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                mapEditor.toggle();
                break;
            case KeyboardEvent.KEY_UP:
                mapEditor.moveCursor(Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                mapEditor.moveCursor(Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                mapEditor.moveCursor(Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                mapEditor.moveCursor(Direction.RIGHT);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void registerKeyboardEvent(int key, KeyboardEventType type) {
        KeyboardEvent e = new KeyboardEvent();
        e.setKey(key);
        e.setKeyboardEventType(type);
        this.keyboard.addEventListener(e);
    }
}
