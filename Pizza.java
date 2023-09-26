public class Pizza {
    public int BasePrice;
    public int ExtraTopings;
    public int ExtraCheese;
    public int TakeAwayBag;

    public Boolean isVeg;
    public Boolean isExtraCheese;
    public Boolean isExtraTopings;
    public Boolean isTakeAwayBag;
    public int size;
    public int Total;
    public String bill;
    public Pizza(Boolean isVeg,int size){
        this.isVeg =isVeg;
        this.size =size;
        if(isVeg)
        {
            switch(size){
                case 0:small(isVeg);
                break;
                case 1:medium(isVeg);
                break;
                case 2:large(isVeg);
                break;
            }
            this.ExtraTopings =50;
        }else{
            switch(size){
                case 0:small(isVeg);
                    break;
                case 1:medium(isVeg);
                    break;
                case 2:large(isVeg);
                break;
            }
            this.ExtraTopings =80;
        }
        this.ExtraCheese =30;
        this.TakeAwayBag =15;
        this.isExtraCheese =false;
        this.isExtraTopings =false;
        this.isTakeAwayBag =false;
        this.Total =Total;
        this.bill =bill;

    }
    private void small(Boolean isVeg){
        if(isVeg){
            this.BasePrice =150;
        }else{
            this.BasePrice =200;
        }
    }
    private void medium(Boolean isVeg){
        if(isVeg){
            this.BasePrice =250;
        }else{
            this.BasePrice =300;
        }
    }
    private void large(Boolean isVeg){
        if(isVeg){
            this.BasePrice =350;
        }else{
            this.BasePrice =400;
        }
    }
    public int getExtraTopings(){
        return ExtraTopings;
    }
    public void addExtraTopings(){
        if(!isExtraTopings){
            isExtraTopings =true;
        }
    }
    public int getExtraCheese(){
        return ExtraCheese;
    }
    public void addExtraCheese(){
        if(!isExtraCheese){
            isExtraCheese =true;
        }
    }
    public int getTakeAwayBag(){
        return TakeAwayBag;
    }
    public void addTakeAwayBag(){
        if(!isTakeAwayBag){
            isTakeAwayBag =true;
        }
    }
    public String getbill(){
        if(isVeg){
            bill ="Your Veg ";
        }else{
            bill ="Your Non-Veg ";
        }
        switch(size){
            case 0:bill+="small pizza price "+this.BasePrice+"/-"+"\n";
            break;
            case 1:bill+="medium pizza price "+this.BasePrice+"/-"+"\n";
            break;
            case 2:bill+="large pizza price "+this.BasePrice+"/-"+"\n";
            break;
        }
        this.Total+=this.BasePrice;
        if(isExtraTopings){
            bill+="Price for ExtraCheese "+this.ExtraCheese+"/-"+"\n";
            this.Total +=this.ExtraCheese;
        }
        if(isExtraTopings){
            bill+="Price for ExtraTopings "+this.ExtraTopings+"/-"+"\n";
            this.Total +=this.ExtraTopings;
        }
        if(isTakeAwayBag){
            bill+="Price for TakeAwayBag "+this.TakeAwayBag+"/-"+"\n";
            this.Total +=this.TakeAwayBag;
        }
        bill+="Your final price for pizza "+this.Total+"/-"+"\n";
        return bill;
    }
    public int getTotal(){
            return this.Total;
    }
}
