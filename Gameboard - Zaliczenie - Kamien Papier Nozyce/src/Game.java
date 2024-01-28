public abstract class Game {
    private boolean isFinished;

    public abstract void start();
    public abstract void finish();
    public abstract void updateScore(String result);

    public boolean isFinished() {
        return isFinished;
    }

    protected void setFinished(boolean finished) {
        isFinished = finished;
    }
}