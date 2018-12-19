public class codeWordChecker {
    int min; int max; String not;
    public codeWordChecker(int min, int max, String not){
        this.min = min;
        this.max = max;
        this.not = not;
    }
    public codeWordChecker(String not){
        this.min = 6;
        this.max = 20;
        this.not = not;
    }
    public boolean isValid(String str){
        return(str.length() >= min && str.length() <= max && str.indexOf(not)>0);
    }
}
