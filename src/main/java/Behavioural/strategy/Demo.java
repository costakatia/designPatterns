package Behavioural.strategy;

public class Demo {
    private Context context;

    public Demo(Context context){
        this.context = context;
    }

    public static void main(String[] args){
        Context context = new Context(new BubbleSortStrategy());
        Demo demo = new Demo(context);
        demo.execute();
    }

    private void execute() {
        System.out.println(context.doSomething());
        context.setMyStrategy(( new MergeSortStrategy()));
        System.out.println(context.doSomething());

    }
}
