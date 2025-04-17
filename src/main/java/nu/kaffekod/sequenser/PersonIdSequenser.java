package nu.kaffekod.sequenser;

public class PersonIdSequenser {
    private int currentId;

    private PersonIdSequenser(){};

    private static class SingletonHelper {
        private static final PersonIdSequenser INSTANCE = new PersonIdSequenser();
    }

    public static PersonIdSequenser getInstance() {
        return SingletonHelper.INSTANCE;
    }


    public int getCurrentId() {
        return currentId;
    }
    
    public void setCurrentId(int id) {
        currentId = id;
    }

    public int nextId() {
        return ++currentId;
    }
}
