package net.greet;

public class Class2 {
    String words;
    public Class2(String words){
        if (words.isEmpty()){
            System.out.println("you did not enter any string ".toUpperCase());
        }else if ("exit".equals(words)){
            System.exit(0);
        }else {
            String[] wordsArray = words.split(" ");
            System.out.println(words.toUpperCase() +": Has (".toUpperCase()+wordsArray.length+") words".toUpperCase());
            /*
            * the reason the above line is equated to wordsOfArray alone
            * it because i have set the var Words to String
            * therefore i cannot return var wordsOfArray with the
            * .length method because it returns a an Integer
            * */
            this.words = String.valueOf(wordsArray.length);
        }
    }

    public String getCount_words(){
        return words;
    }
}
