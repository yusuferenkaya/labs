public class BlackTea extends TeaBeverage{

    private boolean hasLemon;
    private int size;
    private String name;


    public BlackTea(boolean hasLemon, int size){
        super(hasLemon,size);
        this.hasLemon = hasLemon;
        this.size = size;

    }

    @Override
    public int cost(){
        if(size == 0 && hasLemon == true){
            return 4;
        }
        else if(size == 0 && hasLemon == false){

            return 3;

        }
        else if(size == 1 && hasLemon == true){

            return 5;
        }
        else if(size == 1 && hasLemon == false){

            return 4;

        }
        else if (size == 2 && hasLemon == true){
            return 6;
        }
        else {
            return 5;
        }
    }



    @Override
    public String getName() {
        String prename = hasLemon == true ? "Black Tea with lemon " : "Black Tea without lemon ";


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
