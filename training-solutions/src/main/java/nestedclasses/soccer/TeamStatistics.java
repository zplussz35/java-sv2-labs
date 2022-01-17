package nestedclasses.soccer;

public class TeamStatistics {
    private String teamName;
    private Game game;
    private int goalsFor;
    private int goalsAgainst;
    private int score;

    public TeamStatistics(String teamName){
        this.teamName = teamName;
        this.game = new Game();
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst){
        this.goalsFor+=plusGoalsFor;
        this.goalsAgainst+=plusGoalsAgainst;
        if(plusGoalsFor>plusGoalsAgainst){
            this.score+=3;
            this.game.won+=1;
        }else if(plusGoalsFor==plusGoalsAgainst){
            this.score+=1;
            this.game.tied+=1;
        }else{
            this.game.lost+=1;
        }
        this.game.played+=1;

    }

    public static class Game{
        private int played;
        private int won;
        private int tied;
        private int lost;
    }

    public String getTeamName() {
        return teamName;
    }
    public int getPlayed(){
        return game.played;
    }

    public int getTied(){
        return game.tied;
    }

    public int getWon(){
        return game.won;
    }
    public int getLost(){
        return game.lost;
    }

    public int getGoalsfor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamStatistics)) return false;

        TeamStatistics that = (TeamStatistics) o;

        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return teamName.hashCode();
    }
}
