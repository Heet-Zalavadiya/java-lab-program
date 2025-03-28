// Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces.

interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();

    void mousePressed();

    void mouseReleased();

    void mouseMoved();

    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    EventDemo() {
        System.out.println("EventDemo object created");
    }

    public void performEvent() {
        System.out.println("Performed Event");
    }

    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }

    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    public void keyReleased() {
        System.out.println("Key Released");
    }

}

class EventDemo_main {
    public static void main(String[] args) {
        EventDemo obj1 = new EventDemo();
        obj1.performEvent();
        obj1.mouseReleased();
        obj1.mousePressed();
        obj1.mouseDragged();
        obj1.mouseMoved();
        obj1.mouseClicked();
        obj1.keyReleased();
        obj1.keyPressed();
    }
}