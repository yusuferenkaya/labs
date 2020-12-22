public class Americano extends CaffeineBeverage {

    private boolean hasMilk;
    private int size;
    private String name;







    public Americano(boolean hasMilk, int size){
        super(hasMilk,size);
        this.hasMilk = hasMilk;
        this.size = size;

    }



    @Override
    public int cost(){
        if(size == 0 && hasMilk == true){
            return 8;
        }
        else if(size == 0 && hasMilk == false){

            return 7;

        }
        else if(size == 1 && hasMilk == true){

            return 9;
        }
        else if(size == 1 && hasMilk == false){

            return 8;

        }
        else if (size == 2 && hasMilk == true){
            return 10;
        }
        else {
            return 9;
        }



    }

    @Override
    public String getName() {
        String prename = hasMilk == true ? "Americano with milk " : "Americano without milk ";


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
