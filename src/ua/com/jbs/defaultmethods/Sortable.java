package ua.com.jbs.defaultmethods;

public interface Sortable {

    default void sort(Object[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length - i); j++){
                if(isMore(arr[j - 1], arr[j])) {
                    Object temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    boolean isMore(Object o, Object o1);

}
