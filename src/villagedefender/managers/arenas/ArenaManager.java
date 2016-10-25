package villagedefender.managers.arenas;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.List;

/**
 * Created by TomVerschueren on 25/10/2016.
 */
public class ArenaManager {

    private List<GameInstance> gameInstances;


    public void addArena(GameInstance arena){
        gameInstances.add(arena);

    }

    public void removeArena(GameInstance arena){
        gameInstances.remove(arena);

    }

    public GameInstance getArena(Player player){
        for(GameInstance gameInstance:gameInstances){
            for(villagedefender.utils.Team team:gameInstance.getTeams()){
                if(team.isInTeam(player))
                    return gameInstance;

            }

        }
        return null;
    }
}
