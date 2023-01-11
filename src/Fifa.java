import java.util.List;

public class Fifa {
    List<Observer<Game>> mObservers;

    void subscribe(Observer<Game> observer) {
        mObservers.add(observer);
    }

    void notify(Game game) {
        for (var observer : mObservers) {
            observer.update(game);
        }
    }
}
