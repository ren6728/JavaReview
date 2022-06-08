public class MobilePhone {
    private String brandName;
    private String colour;
    private int modelNo;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setModelNo(int modelNo) {
        if(modelNo<25 || modelNo>50){
this.modelNo=0;
        }else {
            this.modelNo=modelNo;
        }
    }

    public int getModelNo() {
        return modelNo;
    }

    public static void main(String[] args) {
        MobilePhone moph=new MobilePhone();
        moph.setBrandName("Huawei");
        moph.getBrandName();
        moph.setColour("purple");
        moph.getColour();
        moph.setModelNo(30);
        moph.getModelNo();
    }
}
