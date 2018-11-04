package ua.com.jbs.callback;

public class Work {

    private int someField;

    public void doWork(CallBack callBack) {

        // some long work
        Result типоРезультатДлиннойРаботы = new Result();

        callBack.onFinish(типоРезультатДлиннойРаботы);
    }

    interface CallBack {
        void onFinish(Result result);
        void onError(Error error);
    }

    public static class Result {

    }

    public static class Error {

    }

}
