public class CalModele {
    private int total,ancien, operation;
    private static int premier=0;

    public void setOperation(int operation,int nombre){
        premier++;
        if(premier==1){
            total=nombre;
            this.operation = operation;
        }
        else {
            this.operation = operation;
            doOeration(nombre);

        }
    }

    public void doOeration(int nombre1){

        switch (operation) {
            case 1 :
                add(nombre1);
                break;
            case 2 :
                sub(nombre1);
                break;
            case 3 :
                mul(nombre1);
                break;
            case 4 :
                div(nombre1);

        }
    }
    public void resetTotal(){
        total=total;
        premier=0;
    }
    public int getTotal(){return total;}
    public void add(int nombre){
        total=total+nombre;

    }
    public void sub (int nombre){
        total = total-nombre;
    }
    public void mul(int nombre){
        total = total * nombre;
    }
    public void div(int nombre){
        total=total/nombre;
    }

}
