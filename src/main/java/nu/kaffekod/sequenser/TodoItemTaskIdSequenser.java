package nu.kaffekod.sequenser;

public class TodoItemTaskIdSequenser {
    private  int currentId;

    private TodoItemTaskIdSequenser(){};

    private static class SingletonHelper {
        private static final TodoItemTaskIdSequenser INSTANCE = new TodoItemTaskIdSequenser();
    }

    public static TodoItemTaskIdSequenser getInstance() {
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
