package dtos;

public class TelevisionInputDto {

    private Long id;

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

    public TelevisionInputDto(Long id, String name, String type, String brand, String screenType, String screenQuality, double price, double availableSize, double refreshRate, boolean wifi, boolean smartTv, boolean voiceControl, boolean hdr, boolean bluetooth, boolean ambiLight, Integer originalStock, Integer sold) {
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

    public String getName() { return name; }

    public String getType() { return type; }

    public String getBrand() { return brand; }

    public String getScreenType() { return screenType; }

    public String getScreenQuality() { return screenQuality; }

    public double getPrice() { return price; }

    public double getAvailableSize() { return availableSize; }

    public double getRefreshRate() { return refreshRate; }

    public boolean getWifi() { return wifi; }

    public boolean getSmartTv() {
        return smartTv;
    }

    public boolean getVoiceControl() {
        return voiceControl;
    }

    public boolean getHdr() {
        return hdr;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public boolean getAmbiLight() {
        return ambiLight;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public Integer getSold() {
        return sold;
    }

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

    public void setSold(Integer sold) {
        this.sold = sold;
    }

}






