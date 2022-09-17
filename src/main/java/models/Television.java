package models;

@Entity
public class Television {

    // Een entiteit moet een primary key bevatten(id)

    @Id
    @GeneretadValue
    Long id;

    // variabele declaraties

    private String name;

    private String type;

    private String brand;

    private String screenType;

    private String screenQuality;

    private double price;

    private double availableSize;

    private double refreshRate;

    private boolean wifi;

    private boolean smartTv;

    private boolean voiceControl;

    private boolean hdr;

    private boolean bluetooth;

    private boolean ambiLight;

    private Integer originalStock;

    private Integer sold;

    public Television() {
    }

    public Television(Long id, String name, String type, String brand, String screenType, String screenQuality, double price, double availableSize, double refreshRate, boolean wifi, boolean smartTv, boolean voiceControl, boolean hdr, boolean bluetooth, boolean ambiLight, Integer originalStock, Integer sold) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.screenType = screenType;
        this.screenQuality = screenQuality;
        this.price = price;
        this.availableSize = availableSize;
        this.refreshRate = refreshRate;
        this.wifi = wifi;
        this.smartTv = smartTv;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.bluetooth = bluetooth;
        this.ambiLight = ambiLight;
        this.originalStock = originalStock;
        this.sold = sold;

    }


    // Alle variable getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getScreenType() {
        return screenType;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public double getPrice() {
        return price;
    }

    public double getAvailableSize() {
        return availableSize;
    }

    public double getRefreshRate() {
        return refreshRate;
    }

    public boolean getWifi() {
        return wifi;
    }

    public boolean getsmartTV() {
        return smartTv;
    }

    public boolean getvoiceControl() {
        return voiceControl;
    }

    public boolean gethdr() {
        return hdr;
    }

    public boolean getbluetooth() {
        return bluetooth;
    }

    public boolean getambiLight() {
        return ambiLight;
    }

    public Integer getoriginalStock() {
        return originalStock;
    }

    public Integer getsold() {
        return sold;
    }


    // Alle variable setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableSize(Double availableSize) {
        this.availableSize = availableSize;
    }

    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public void setVoiceControl(boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public void hdr(boolean hdr) {
        this.hdr = hdr;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setAmbiLight(boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public void sold(Integer sold) {
        this.sold = sold;
    }

}













//    Aantekening:

//    constructors hoeven niet per se aangemaakt te worden
//    // Een default constructor
//    public Television() {}
//
//    // Een constructor met alle gevraagde variable
//    public Television(
//            Long id,
//            String type,
//            String brand,
//            String name,
//            Double price,
//            Double availableSize,
//            Double refreshRate,
//            String screenType,
//            String screenQuality,
//            Boolean smartTv,
//            Boolean wifi,
//            Boolean voiceControl,
//            Boolean hdr,
//            Boolean bluetooth,
//            Boolean ambiLight,
//            Integer originalStock,
//            Integer sold ) {
//        this.id = id;
//        this.type = type;
//        this.brand = brand;
//        this.name = name;
//        this.price = price;
//        this.availableSize = availableSize;
//        this.refreshRate = refreshRate;
//        this.screenType = screenType;
//        this.screenQuality = screenQuality;
//        this.smartTv = smartTv;
//        this.wifi = wifi;
//        this.voiceControl = voiceControl;
//        this.hdr = hdr;
//        this.bluetooth = bluetooth;
//        this.ambiLight = ambiLight;
//        this.originalStock = originalStock;
//        this.sold = sold;
//    }




