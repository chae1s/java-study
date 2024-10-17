package study.oop.model;

public class CarUtility {
    public void carPrint(CarVO carVO) {
        System.out.println(carVO.carSn+"\t"+carVO.carName+"\t"+carVO.carPrice+"\t"+carVO.carOwner+"\t"+carVO.carYear+"\t"+carVO.carType);
    }
}
