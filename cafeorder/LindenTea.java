public class LindenTea extends TeaBeverage {

    private boolean hasLemon;
    private int size;
    private String name;


    public LindenTea(boolean hasLemon, int size){
        super(hasLemon,size);
        this.hasLemon = hasLemon;
        this.size = size;

    }

    @Override
    public int cost(){
        if(size == 0 && hasLemon == true){
            return 6;
        }
        else if(size == 0 && hasLemon == false){

            return 5;

        }
        else if(size == 1 && hasLemon == true){

            return 7;
        }
        else if(size == 1 && hasLemon == false){

            return 6;

        }
        else if (size == 2 && hasLemon == true){
            return 8;
        }
        else {
            return 7;
        }
    }
    @Override
    public String getName() {
        String prename = hasLemon == true ? "Linden tea with lemon " : "Linden tea without lemon";

        if (size == 0){
            return name = ("Small" + " " + prename );
        }
        else if(size == 1) {
            return name = ("Medium" + " " + prename);
        }
        else{
            return name = ("Large" + " " + prename );

        }
    }


}
