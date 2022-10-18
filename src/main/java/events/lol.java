package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class lol extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event){
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if(messageSent[0].equalsIgnoreCase("lol")){
            if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("lol").queue();
            }
        }
    }
}

