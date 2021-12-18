package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb = new PhrasalVerb("eszik","meg");
        Verb verbSuff = new PhrasalVerbWithSuffix("hagy","meg","ott");

        Preposition preposition = new PhrasalVerb("eszik","meg");
        Preposition prepositionSuff = new PhrasalVerbWithSuffix("hagy","meg","ott");

        PhrasalVerb phrasalVerb = new PhrasalVerb("eszik","meg");
        PhrasalVerb phrasalVerbSuff = new PhrasalVerbWithSuffix("hagy","meg","ott");

        Suffix suffix = new PhrasalVerbWithSuffix("hagy","meg","ott");

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("hagy","meg","ott");

        System.out.println(verb.getWord());
        System.out.println(verbSuff.getWord());

        System.out.println(preposition.getPreposition()+" "+preposition.getWholeWord());
        System.out.println(prepositionSuff.getPreposition()+" "+prepositionSuff.getWholeWord());
        System.out.println(phrasalVerb.getPreposition()+" "+phrasalVerb.getWord()+" "+phrasalVerb.getWholeWord());
        System.out.println(phrasalVerbSuff.getPreposition()+" "+phrasalVerbSuff.getWord()+" "+phrasalVerbSuff.getWholeWord());
        System.out.println(suffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getSuffix()+" "+phrasalVerbWithSuffix.getPreposition()+" "+phrasalVerbWithSuffix.getWord()+" "+phrasalVerbWithSuffix.getWholeWord());









    }
}
