package uk.co.angrybee.joe.commands.minecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandDiscord implements CommandExecutor {

    // /discord
    // about command
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
    	sender.getServer().dispatchCommand(sender.getServer().getConsoleSender(), "tellraw " + sender.getName() + " [\"Click the link below:\",\"\\n\",{\"text\":\"https://discord.gg/ZeyXpcDKEc\",\"underlined\":true,\"color\":\"aqua\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/ZeyXpcDKEc\"},\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[\"click me!\"]}}] ");
        return true;
    }
}
