package net.kaikk.mc.fr;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public interface ProtectionHandler {
	boolean canBuild(Player player, Location location);
	boolean canAccess(Player player, Location location);
	
	boolean canUse(Player player, Location location);
	boolean canOpenContainer(Player player, Block block);
	boolean canInteract(Player player, Location location);

	boolean canAttack(Player damager, Entity damaged);
	
	boolean canProjectileHit(Player player, Location location);
	boolean canUseAoE(Player player, Location location, int range);
	
	String getName();
}
