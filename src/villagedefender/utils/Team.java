package villagedefender.utils;

import org.bukkit.Color;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

/**
 * Created by TomVerschueren on 25/10/2016.
 */
public class Team {

    private List<UUID> players;
    private Color color;


    public Team(Color color){
        this.color = color;
    }

    public void addPlayer(Player player){
        players.add(player.getUniqueId());

    }

    public boolean isInTeam(Player player){
        return players.contains(player.getUniqueId());

    }

    public void removePlayer(Player player){
        players.remove(player.getUniqueId());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
