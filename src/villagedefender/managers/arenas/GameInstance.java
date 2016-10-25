package villagedefender.managers.arenas;

import org.bukkit.scheduler.BukkitRunnable;
import villagedefender.utils.Team;
import villagedefender.enums.GameState;

import java.util.List;

/**
 * Created by TomVerschueren on 25/10/2016.
 */
public class GameInstance extends BukkitRunnable {


    private int ID;
    private int MAX_PLAYERS;
    private int MIN_PLAYERS;
    private int TEAMS;
    private int MAX_PLAYERS_PER_TEAM;
    private int NUMBER_OF_TEAMS;
    private GameState gameState;
    private List<Team> teams;


    public GameInstance(int ID){
        this.ID = ID;
        this.gameState = GameState.WAITING_FOR_PLAYERS;
    }

    @Override
    public void run() {
        switch(gameState){
            case WAITING_FOR_PLAYERS:

                break;
            case STARTING:

                break;
            case INGAME:

                break;
            case ENDING:

                break;
            case RESTARTING:

                break;


        }
    }

    public int getNUMBER_OF_TEAMS() {
        return NUMBER_OF_TEAMS;
    }

    public void setNUMBER_OF_TEAMS(int NUMBER_OF_TEAMS) {
        this.NUMBER_OF_TEAMS = NUMBER_OF_TEAMS;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMAX_PLAYERS() {
        return MAX_PLAYERS;
    }

    public void setMAX_PLAYERS(int MAX_PLAYERS) {
        this.MAX_PLAYERS = MAX_PLAYERS;
    }

    public int getMIN_PLAYERS() {
        return MIN_PLAYERS;
    }

    public void setMIN_PLAYERS(int MIN_PLAYERS) {
        this.MIN_PLAYERS = MIN_PLAYERS;
    }

    public int getTEAMS() {
        return TEAMS;
    }

    public void setTEAMS(int TEAMS) {
        this.TEAMS = TEAMS;
    }

    public int getMAX_PLAYERS_PER_TEAM() {
        return MAX_PLAYERS_PER_TEAM;
    }

    public void setMAX_PLAYERS_PER_TEAM(int MAX_PLAYERS_PER_TEAM) {
        this.MAX_PLAYERS_PER_TEAM = MAX_PLAYERS_PER_TEAM;
    }
}
