interface Drawable {
    void draw();
}

class Square implements Drawable {
    public void draw() { System.out.println("Drawing square"); }
}