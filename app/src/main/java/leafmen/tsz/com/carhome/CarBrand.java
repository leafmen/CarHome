package leafmen.tsz.com.carhome;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzs on 2015/9/26.
 */
public class CarBrand {
    public List<String> getCarBrand(String type) {
        List<String> carBrand;
        carBrand = new ArrayList<>();
        switch (type) {
            case "热门车":
                carBrand.add("现代");
                carBrand.add("特斯拉");
                break;
            case "豪华车":
            carBrand.add("宝马");
            carBrand.add("奥迪");
                break;
            case "越野车":
                carBrand.add("北京吉普");
                carBrand.add("牧羊人");
                break;
            case "商务车":
                carBrand.add("别克");
                break;
            case "推荐车":
                carBrand.add("宝马");
                break;
            case "二手车":
                carBrand.add("丰田");
                break;
            default:
            break;
        }
        return carBrand;
    }
}
