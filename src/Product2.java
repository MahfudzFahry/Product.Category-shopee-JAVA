




public class Product2 {

    private String No;
    private String code;
    private String category;
    private String sub_category;
    private String L3;
    private String product_name;
    private String L5;
    private byte[] gambar;
    
    public Product2(){}
    
    public Product2(String No, String code, String category, String sub_category, String L3,String product_name, String L5, byte[] gambar){
        this.No = No;
        this.code = code;
        this.category = category;
        this.sub_category = sub_category;
        this.L3 = L3;
        this.product_name = product_name;
        this.L5 = L5;
        this.gambar = gambar;
       
    }

    public String getL3() {
        return L3;
    }

    public void setL3(String L3) {
        this.L3 = L3;
    }
    
    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category (String sub_category) {
        this.sub_category =sub_category ;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name (String product_name) {
        this.product_name = product_name ;
    }
    public String getL5() {
        return L5;
    }

    public void setL5 (String L5) {
        this.L5 = L5 ;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }
    
}