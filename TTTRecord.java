public class TTTRecord{
    
    private String config;
    private int score;
    private int level;

    public TTTRecord(String config, int score, int level){
       this.config = config;
       this.score = score;
       this.level = level;
    }
    
    public String getConfiguration(){
        return config;
    }
    public int getScore(){
        return score;
    }
    public int getLevel(){
        return level;
    }
    public void HelloWorld(){
        System.out.println("Hello World");
    }
}

