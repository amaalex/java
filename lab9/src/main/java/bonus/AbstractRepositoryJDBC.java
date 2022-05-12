package bonus;

public abstract class AbstractRepositoryJDBC<T> implements AbstractRepository{

    public abstract T findById(int id);
}
