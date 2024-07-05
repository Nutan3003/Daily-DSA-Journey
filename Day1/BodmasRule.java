public class BodmasRule {
    public static void main(String[] args) {
        //Bodmas Rule And precedence
        //Rank1:Brackets:()[]{}
        //Rank1: */  -------->Left to right
        //Rank1: +-   -------->left to right
        //Rank1: ^   --------->Right to left
        System.out.println("Nutan"+100 +9);
        //Output  : Nutan1009        ---Because of precendence.The string and INT(100) cancat.1st and then that result concat.  with 9

        System.out.println(100+8+"Nutan");
        //Output: 108Nutan      ---Ist Addition of two integer and then cancat. with String 
    }
}
