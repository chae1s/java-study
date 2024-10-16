package study.oop;

import study.oop.model.CarVO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동 해야 되는 경우를 생각해보자.
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scanner.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = scanner.nextLine();

        System.out.print("자동차 연식 : ");
        int carYear = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 타입 : ");
        String carType = scanner.nextLine();

//        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);

        CarVO car = new CarVO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        carInfoPrint(car);
    }

    public static void carInfoPrint(CarVO car) {
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
