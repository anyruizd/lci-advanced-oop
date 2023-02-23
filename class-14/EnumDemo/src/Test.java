public class Test {
    public Color color;

    public Test(Color color) {
        this.color = color;
    }

    public void colorIsLike() {
        switch (color) {
            case RED:
                System.out.println("Red is like roses");
                break;
            case GREEN:
                System.out.println("Green is like the forest");
                break;
            case YELLOW:
                System.out.println("Yellow is like the sun flower");
                break;
            case BLACK:
                System.out.println("Black is like the night");
                break;
            default:
                System.out.println("I love all the colors!");
                break;
        }
    }

}
