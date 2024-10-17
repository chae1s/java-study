package study.oop;

import study.oop.model.CarDAO;
import study.oop.model.CarVO;

import java.util.Scanner;

public class CarDAOTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 키보드로부터 입력을 받아서 DB에 저장을 하세요.
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

        CarVO car = new CarVO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO carDAO = new CarDAO();
        carDAO.carInsert(car);

        carDAO.carSelect();
    }
}
