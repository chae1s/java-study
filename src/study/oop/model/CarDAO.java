package study.oop.model;

// DAO 모델링 -> DB 연결 X
public class CarDAO {
    // CRUD
    // Create = insert(저장)
    public void carInsert(CarVO carVO) {
        // DB 연결
        System.out.println("car 정보가 DB에 저장이 되었습니다");

    }

    // Read = select
    public void carSelect() {
        // DB 연결
        System.out.println("car 정보가 출력이 되었습니다.");

    }

    // Update = update
    public void carUpdate(CarVO carVO) {
        // DB 연결
        System.out.println("car 정보가 DB에 저장이 되었습니다");

    }

    // Delete
    public void carDelete(CarVO carVO) {
        // DB 연결
        System.out.println("car 정보가 DB에 저장이 되었습니다");

    }

}
