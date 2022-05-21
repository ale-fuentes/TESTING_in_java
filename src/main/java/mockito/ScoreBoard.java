package mockito;

public class ScoreBoard {

    //initialize variables
    private Integer tienum;
    private Integer winnum;
    private Integer lossnum;

    public ScoreBoard() {
        this.tienum = 0;
        this.winnum = 0;
        this.lossnum = 0;
    }

    public Integer getTienum() {
        return tienum;
    }

    public Integer getWinnum() {
        return winnum;
    }

    public Integer getLossnum() {
        return lossnum;
    }

    public void incrementWin(){
        this.winnum++;
    }
    public void incrementLoss(){
        this.lossnum++;
    }

    public void incrementTie(){
        this.tienum++;
    }
}
