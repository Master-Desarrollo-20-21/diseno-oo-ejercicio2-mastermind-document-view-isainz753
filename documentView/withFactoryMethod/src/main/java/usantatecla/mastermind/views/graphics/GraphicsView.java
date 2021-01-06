package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public class GraphicsView extends View {

    private GameView gameView;

    public GraphicsView(Game game) {
        super(game);
        this.gameView = new GameView(this.game);
    }

    @Override
    protected void start() {
        this.gameView.start();
    }

    @Override
    protected boolean propose() {
        return this.gameView.propose();
    }

    @Override
    protected boolean isNewGame() {
        ResumeDialog resumeDialog = new ResumeDialog();
        boolean newGame = resumeDialog.isNewGame();
        if (newGame) {
            this.game.reset();
            this.gameView = new GameView(this.game);
            return true;
        } else {
            this.gameView.setVisible(false);
            System.exit(0);
            return false;
        }
    }

}
