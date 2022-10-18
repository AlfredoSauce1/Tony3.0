package org.example;

import commands.Calculate;
import commands.Help;
import events.*;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Tony {
    public static String prefix = "t";

    public static void main(String[] args) throws LoginException {


        JDA bot = JDABuilder.createDefault("MTAyOTYxNjgxNTE2NjQ1NTg1OQ.GeYM6X.OGz-pQJj0I3OCd4-fOeRci4FGYu5kCOxLQKPNE")
                .setActivity(Activity.playing("with your mom"))
                .addEventListeners(new ReadyEventListener(), new MessageEventListener(), new HelloEvent()
                , new YoEvent(), new ImTony(), new TonyIm(), new Calculate(), new Help(), new ThatsWhat()
                , new lol())
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .build();

    }
}
