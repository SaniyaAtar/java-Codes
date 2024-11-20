class FirstTask extends  Thread{
static char ch;
    public FirstTask(char ch) {
       this.ch=ch;
    }
    
    public static void firstTask(){
        for(int i=0;i<50;i++){
            System.out.println(ch
            );
        }
    }
}