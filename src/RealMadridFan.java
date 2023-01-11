public class RealMadridFan<T> implements Observer<T> {
    T game;
    @Override
    public void update(T context) {
        game = context;
    }
}
