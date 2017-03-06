package me.ryarrowsmith.relash3.commands.stats;

import me.ryarrowsmith.relash3.utils.BotUtils;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.exceptions.PermissionException;

/**
 * Created by Ryan's PC on 05/03/2017.
 */
public final class Info extends BotUtils
{
	
	public void info(Message trigger)
	{
		
		final MessageChannel channel = trigger.getChannel();
		final JDA jda = trigger.getJDA();
		
		int roles = 0;
		for (Guild guild : jda.getGuilds())
		{
			
			roles += guild.getRoles().size();
		}
		
		try
		{
			
			channel.sendMessage(makeEmbed("❗❗ Relash Info ❗❗", "Relash3 is a bot, which is a rewrite of a bot, which is a rewrite of a bot which is based on a selfbot made for me by someone else. k", "Owner: RYArrowsmith#8070", "Library: JDA (Java Discord API) 3.0.BETA2_143", "Guilds: " + jda.getGuilds().size(), "Channels: " + (jda.getPrivateChannels().size() + jda.getVoiceChannels().size() + jda.getTextChannels().size()), "Roles: " + roles, "Users: " + jda.getUsers().size(), "Support: https://bfnt.io/relash-support", "Invite: https://bfnt.io/relash-invite", "Donate: https://bfnt.io/relash-donate").setThumbnail(jda.getSelfUser().getEffectiveAvatarUrl()).build()).queue();
			
		}
		catch (PermissionException e)
		{
			
			channel.sendMessage("memes").queue();
		}
	}
}
