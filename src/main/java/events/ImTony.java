package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ImTony extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if(messageSent[0].equalsIgnoreCase("im")){
            if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("Im tony").queue();
            }
        }
    }
}
