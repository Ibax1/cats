public class LowJumpDecorator extends CatDecorator {
    public LowJumpDecorator(Cat catToBeDecorated) {
        super(catToBeDecorated);
    }

    @Override
    public void jump() {
        System.out.println("jump low");
    }
}
