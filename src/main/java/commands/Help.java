package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();
        if(messageSent[0].equalsIgnoreCase("$help")){
            if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("Commands list \n $calc \n $sigma").queue();
            }
        }

    }
}