package ua.com.jbs.callback;

public class Main {

    public static void main(String[] argv) {
        new Work().doWork(new Work.CallBack() {
            @Override
            public void onFinish(Work.Result result) {

            }

            @Override
            public void onError(Work.Error error) {

            }
        });
    }

}
