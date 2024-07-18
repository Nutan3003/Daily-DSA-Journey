public class Toggle_Char {
    public static void toggle(char []ch){
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
            else{
                ch[i]=(char)(ch[i]-32);

            }
        }
    }

    public static void main(String[] args) {
        char[]ch={'n','U','T','a','n'};
        toggle(ch);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]+" ");
        }

    }
    
}
