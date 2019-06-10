package bot;

import bot.adapter.BotExecuter;

public class Main {

    public static void main(String[] args) {

        // un bot executer qui interroge l'adaptateur
        BotExecuter botExecuter = new BotExecuter();

        botExecuter.parler("Hello","i'm a student of computer sciences");

        botExecuter.parler("Bonjour","je suis un étudiant en informatique");

        botExecuter.parler("Hola","hola amigo");
    }
}
