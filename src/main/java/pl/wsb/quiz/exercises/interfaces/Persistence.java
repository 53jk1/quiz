package pl.wsb.quiz.exercises.interfaces;

public interface Persistence {
    final static int VERSION = 10;
    void save(Object o);
    Object load(int id);
    private void help(){
        System.out.println("Helping");
    }

    default void cycle(int id){
        Object obj = load(id);
        help();
        save(obj);
    }
}
