package bot.adapter;

public class BotExecuter implements BotTalker {

    BotAdapter botAdapter;

    @Override
    public void parler(String premierMot, String text) {

        // adapter l'objet selon le premier mot pour cibler le bot de la meme langue
        if(premierMot.equals("Bonjour")){
            botAdapter = new BotAdapter(premierMot);
            botAdapter.parler(premierMot,text);

        }else if(premierMot.equals("Hello")){
            botAdapter = new BotAdapter(premierMot);
            botAdapter.parler(premierMot,text);
        }
        else{
            System.out.println("Erreur le mot *"+premierMot+"* n'est pas reconnue! ");
        }

    }
}
