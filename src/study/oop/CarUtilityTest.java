package study.oop;

import study.oop.model.CarUtility;
import study.oop.model.CarVO;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하시오.
        int carSn = 1110;
        String carName = "santafe";
        int carPrice = 50000000;
        String carOwner = "choonbae";
        int carYear = 2024;
        String carType = "G";

        CarVO carVO = new CarVO();
        carVO.carSn = carSn;
        carVO.carName = carName;
        carVO.carPrice = carPrice;
        carVO.carOwner = carOwner;
        carVO.carYear = carYear;
        carVO.carType = carType;

        CarUtility carUtility = new CarUtility();

        carUtility.carPrint(carVO);
    }


}
