package io.bfnt.relash.commands;

import io.bfnt.relash.util.RelashCommand;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.exceptions.PermissionException;

/**
 * Created by Ryan's PC on 07/03/2017.
 */
public class Help extends RelashCommand {

    public void help(Message trigger){

        final TextChannel channel = trigger.getTextChannel();

        try {

            channel.sendMessage(makeEmbed("❗❗ Relash Help ❗❗","No commands yet.").build()).queue();

        } catch (PermissionException exception){

            channel.sendMessage("❗❗ Relash Help ❗❗\nNo commands yet.").queue();
        }
    }
}