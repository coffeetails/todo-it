package nu.kaffekod.sequenser;

public class TodoItemIdSequenser {
    private int currentId;

    private TodoItemIdSequenser(){};

    private static class SingletonHelper {
        private static final TodoItemIdSequenser INSTANCE = new TodoItemIdSequenser();
    }

    public static TodoItemIdSequenser getInstance() {
        return SingletonHelper.INSTANCE;
    }


    public  int getCurrentId() {
        return currentId;
    }
    public  void setCurrentId(int id) {
        currentId = id;
    }

    public  int nextId() {
        return ++currentId;
    }
}
