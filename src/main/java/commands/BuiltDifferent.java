package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class BuiltDifferent extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if(messageSent[0].equalsIgnoreCase("$sigma")){

            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Im just built different");
            eb.setImage("https://melmagazine.com/wp-content/uploads/2021/01/66f-1.jpg");
            eb.setColor(Color.BLACK);
            event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
    }
}
