abstract class CatDecorator {
    protected Cat catToBeDecorated; // the Window being decorated

    public CatDecorator (Cat catToBeDecorated) {
        this.catToBeDecorated = catToBeDecorated;
    }
    public void display() {
        this.catToBeDecorated.display();
    }

    public void purr() {
        this.catToBeDecorated.purr();
    }

    public void meow() {
        this.catToBeDecorated.meow();
    }

    public void jump() {
        this.catToBeDecorated.jump();
    }
}

