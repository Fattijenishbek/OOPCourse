package acronym;

public class Acronym {
    private String acr="";
    private String phrase;
    public Acronym(String phrase) {
        this.phrase =phrase;
        converter();
    }
    private void converter(){

        String[] arr= phrase.replaceAll("-", " ").split(" ");
        for(String a: arr){
            if(!a.equals("")){
                acr+=a.replaceAll("[^A-Za-z0-9]", "").substring(0,1);
            }
        }

    }
    public String get(){
        return acr.toUpperCase();
    }

}
