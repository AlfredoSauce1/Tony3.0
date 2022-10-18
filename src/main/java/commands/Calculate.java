package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        String[] message = event.getMessage().getContentRaw().split(" ");

        if(message[0].equalsIgnoreCase("$calc")&& message.length == 1){
            event.getChannel().sendMessage("To use this command (type without brackets): $calc number [+,-,*,/] number").queue();

        }else if(message[0].equalsIgnoreCase("$calc")&& message[2].equalsIgnoreCase("+")){
            double num1 = Double.parseDouble(message[1]);
            double num2 = Double.parseDouble(message[3]);
            event.getChannel().sendMessage("Idk what you got but I got " + (num1 + num2) + " that could just be me tho \nbro this is doing numbers").queue();

        }else if(message[0].equalsIgnoreCase("$calc")&& message[2].equalsIgnoreCase("-")){
            double num1 = Double.parseDouble(message[1]);
            double num2 = Double.parseDouble(message[3]);
            event.getChannel().sendMessage("Idk what you got but I got " + (num1 - num2) + " that could just be me tho \nbro this is doing numbers").queue();

        }else if(message[0].equalsIgnoreCase("$calc")&& message[1].equalsIgnoreCase("/")){
            double num1 = Double.parseDouble(message[1]);
            double num2 = Double.parseDouble(message[3]);
            event.getChannel().sendMessage("Idk what you got but I got " + (num1 / num2) + " that could just be me tho \nbro this is doing numbers").queue();

        }else if(message[0].equalsIgnoreCase("$calc")&& message[2].equalsIgnoreCase("*")){
            double num1 = Double.parseDouble(message[1]);
            double num2 = Double.parseDouble(message[3]);
            event.getChannel().sendMessage("Idk what you got but I got " + (num1 * num2) + " that could just be me tho \nbro this is doing numbers").queue();

        }
    }
}
