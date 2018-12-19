public class runner{

        public static void main(String[]args){
        codeWordChecker newChecker =new codeWordChecker(1,20,"carrot");
        codeWordChecker newChecker2=new codeWordChecker("dio");

        System.out.println(newChecker.isValid("carrotcake"));
        System.out.println(newChecker.isValid("cake"));
        System.out.println(newChecker.isValid("kono dio da"));
        System.out.println(newChecker2.isValid("you expected true, but it is i, dio"));
        System.out.println(newChecker2.isValid("thanoscar"));
        System.out.println(newChecker2.isValid("verylongstringthatwillreturnfalsebecausedefaultmaxis20"));
        }
}